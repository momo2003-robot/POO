# attalah mohamed.
## TP 6 Manpulation d'images

### Présentation du TP :






#### Compilation de GrayColor :
```
javac -sourcepath src src/image/color/GrayColor.java -d classes
```

#### Compilation de Pixel :
```
javac -sourcepath src src/image/Pixel.java -d classes
```

#### Compilation de Image :
```
javac -sourcepath src src/image/Image.java -d classes
```

#### Compilation de ImageExampleMain :
```
javac -sourcepath src src/image/ImageExampleMain.java -d classes
```

#### Execution de ImageExampleMain :
```
java -classpath classes image.ImageExampleMain
```

#### Compilation de ImageMain :
```
javac -sourcepath src src/image/ImageMain.java -d classes
``` 

#### Execution de ImageMain :
```
java -classpath classes image.ImageMain
```


#### compilation des tests : 
```
javac -classpath junit-console.jar:classes test/ImageTest.java
```

#### Execution des tests : 
```
java -jar junit-console.jar -classpath test:classes -scan-classpath
```


