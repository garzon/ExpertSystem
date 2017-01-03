## 基于规则的专家系统框架
在本次人工智能project中，实现了一个采用前向链接技术的的基于规则的专家系统框架。其中，创造了一种类似书上所用的，可读性高的知识规则描述语言，用于创造知识库，作为推理引擎的输入。因此，可以在不改变任何代码、不重新编译的情况下，随时替换知识库，实现另外一个专家系统。

### 程序用法与示例
- 需要安装Java sdk（推荐1.7版本），并且把`java.exe`和`javac.exe`所在目录置于环境变量`PATH`下。

在Windows下，只需要双击目录内`run.bat`批处理文件即可运行。Linux下请自行参照修改命令运行。

#### 示例
默认采用书上42页中所描述的知识库。运行后可以发生如下对话（这里用“>”表示是用户输入，其他为程序提示）：
```
Please input 'environment', must be one of {'textbooks', 'photographs', 'documents', 'illustrations', 'pictures', 'papers', 'unknown', 'machines', 'computer programs', 'tools', 'formulas', 'numbers', 'buildings', 'manuals', 'diagrams', }:
> machines
Please input 'job', must be one of {'building', 'troubleshooting', 'evaluating', 'writing', 'unknown', 'advising', 'repairing', 'drawing', 'lecturing', 'reasoning', 'typing', 'investigating', 'counselling', }:
> repairing
Please input 'feedback', must be one of {'unknown', 'required', 'not required', }:
> required
[Conclusion] 'medium' should be 'workshop'.
```
可以看到跟书上一样得到了`'medium' should be 'workshop'`的结论。

### 专家系统框架介绍
#### 算法原理
程序会读取根目录下的`knowledgeDatabase.txt`知识库，然后根据里面`INPUT`字段的变量类型，询问用户每个变量的取值，然后进行推理，直到`OUTPUT`字段中的所有变量全部被推导出来或者不能在推出结论为止，也就是前向链接技术。程序源代码位于`/src`目录下。

#### 知识库知识规则描述语言介绍
这里自创了一种跟书上类似的知识描述语言，现简要介绍如下，详细语法BNF定义请参考`src/ExpertRule.g4`文件。

首先，需要定义用户输入的变量。定义输入变量的语法如下：
```
INPUT (
	'<变量名>' is string of ('value1' 'value2' ..)
	'<变量名>' is number {from A} {to B}
	...
)
```
（其中{}符号内表示可选，例如`INPUT('X' is number)`也合法）

然后定义输出变量，语法为`OUTPUT( '<变量名>', '<变量2>', ... )`

最后再输入`IF`规则，语法如下（其中`op`可以为`'is'| '=' | '<' | '<=' | '>' | '>=' `）：
```
IF <变量> <op> <值>
{AND | OR} <变量> <op> <值>
...
THEN 
<变量> is <值> 
<变量> is <值>...
```

#### 知识库示例
下面是根目录下的`knowledgeDatabase3.txt`知识库内容（如想运行该知识库，只需复制，替换`knowledgeDatabase.txt`然后双击`run.bat`即可）：
```java
INPUT (
    'X' is number from -1.0 to 1.0
    'Y' is number
)

OUTPUT ('quadrant')

IF 'X' > 0 THEN 'sign of x' is 'positive'
IF 'Y' > 0 THEN 'sign of y' is 'positive'
IF 'X' < 0 THEN 'sign of x' is 'negative'
IF 'Y' < 0 THEN 'sign of y' is 'negative'

IF 'sign of x' is 'positive'
AND 'sign of y' is 'positive'
THEN 'quadrant' is 'first quadrant'

IF 'sign of x' is 'negative'
AND 'sign of y' is 'positive'
THEN 'quadrant' is 'second quadrant'

IF 'sign of x' is 'negative'
AND 'sign of y' is 'negative'
THEN 'quadrant' is 'third quadrant'

IF 'sign of x' is 'positive'
AND 'sign of y' is 'negative'
THEN 'quadrant' is 'fourth quadrant'
```
可见这是一个判断点所在象限的专家系统知识库。运行示例如下（用“>”表示用户输入）：
```
Please input 'X' greater than -1.000000 smaller than 1.000000 :
> abcd
Invalid number. Please try again.
Please input 'X' greater than -1.000000 smaller than 1.000000 :
> -0.8
Please input 'Y' :
> 999
[Conclusion] 'quadrant' should be 'second quadrant'.
```

#### 更多示例知识库
根目录下有`knowledgeDatabase1.txt`，`knowledgeDatabase2.txt`，
`knowledgeDatabase3.txt`，`mediaAdvisorKnowledgeDatabase.txt`四个样例知识库。复制后替换`knowledgeDatabase.txt`再双击`run.bat`即可运行，因此打造新的专家系统非常方便。

第二个知识库是书上36页的例子，由事实ABCDE可以推出XYZ：
```
Please input 'A', must be one of {'true', 'unknown', }:
> true
Please input 'B', must be one of {'true', 'unknown', }:
> true
Please input 'C', must be one of {'true', 'unknown', }:
> true
Please input 'D', must be one of {'true', 'unknown', }:
> true
Please input 'E', must be one of {'true', 'unknown', }:
> true
[Conclusion] 'Y' should be 'true'.
[Conclusion] 'X' should be 'true'.
[Conclusion] 'Z' should be 'true'.
```

若事实D未知，ABCE为真，则只能推出XY：
```
Please input 'A', must be one of {'true', 'unknown', }:
> true
Please input 'B', must be one of {'true', 'unknown', }:
> true
Please input 'C', must be one of {'true', 'unknown', }:
> true
Please input 'D', must be one of {'true', 'unknown', }:
> unknown
Please input 'E', must be one of {'true', 'unknown', }:
> true
Cannot draw any more conclusions. Exit.
[Conclusion] 'Y' should be 'true'.
[Conclusion] 'X' should be 'true'.
```

