package GroovyForJavaEyes

/**
 * Created by qinbingbing on 6/17/16.
 */

def openFile(fileName) {
    new FileInputStream(fileName)
}

try {
    openFile("non_exist_file")
} catch (FileNotFoundException ex) {
    println "Oops: " + ex
}

try {
    openFile("non_exist_file")
} catch (ex) {
    println "Oops: " + ex
}