package GroovyForJavaEyes

/**
 * Created by qinbingbing on 6/17/16.
 */

def foo(str) {
//    if (str != null) str.reverse()
    str?.reverse()
}

println foo('evil')
println foo(null)
