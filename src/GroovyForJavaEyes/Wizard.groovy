package GroovyForJavaEyes

/**
 * Created by qinbingbing on 6/17/16.
 */
def static learn(trick, action) {
    println trick
    println this
    this
}

GroovyForJavaEyes.Wizard.learn('aaa', {/*...*/})
        .learn('bbb', {/*...*/})
        .learn('ccc', {/*...*/})