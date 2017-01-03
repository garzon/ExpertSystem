rm build/ -rf
mkdir build
cp src/ExpertRule.g4 build/
cd build/
java -jar "../antlr-4.6-complete.jar" ./ExpertRule.g4 && javac -cp "../antlr-4.6-complete.jar;./" *.java && java -cp "../antlr-4.6-complete.jar;./" org.antlr.v4.gui.TestRig ExpertRule goal -gui ../knowledgeDatabase.txt && cd ../