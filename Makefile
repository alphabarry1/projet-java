all: clean doc cls help

clean: 
	cd docs; rm -rf *; cd ..
	cd bin; rm -rf *; cd ..
	rm -rf jar/*
	
doc:
	cd src; javadoc -d ../docs/ *; cd ..

tests: 
	
guerre.jar:
	jar cvf ../jar/guerre.jar bin/WarriorMain.class
	java -jar jar/guerre.jar Raymond Odette

agricole.jar:

cls:
	cd src; javac -d ../bin *.java game/*.java; cd ..
	
help:
	@echo "\033[92mDESCRITPTION :\033[0m"
	@echo "    Ce projet comprend deux types de jeu de stratégies sur un plateau :"
	@echo "    1- jeu de guerre: met en face-à-face deux joueurs ayant des armées qui doivent conquerir le plateau"
	@echo "    2- jeu agricole: met en face-à-face deux joueurs ayant des ouvriers exploitant des territoires pour gagner de l'or."
	@echo "\033[92mCOMMANDES :\033[0m"
	@echo "    \033[91mmake clean\033[0m"    
	@echo "    \033[91mmake doc\033[0m permet de produire la javadoc"
	@echo "    \033[91mmake guerre.jar\033[0m permet de lancer le jeu de guerre"
	@echo "    \033[91mmake agricole.jar\033[0m permet de lancer le jeu agricole"
	@echo "    \033[91mmake cls\033[0m permet de générer les fichiers .class du projet"
