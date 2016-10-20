package BasicSyntax

import groovy.transform.Canonical

/**
 * Created by qinbingbing on 10/20/16.
 * Using the event POGO(Plain Old Groovy Object)
 */

@Canonical
class Event {
    String name
    Date when
    int priority
}

Event e1 = new Event(name: 'Android Studio 1.0',
    when: Date.parse('MMM dd, yyyy', 'Dec 8, 2014'),
    priority: 1)

Event e2 = new Event(name: 'Android Studio 1.0',
        when: Date.parse('MMM dd, yyyy', 'Dec 8, 2014'),
        priority: 1)

assert e1.toString() == 'BasicSyntax.Event(Android Studio 1.0, Mon Dec 08 00:00:00 CST 2014, 1)'
assert e1 == e2

Set events = [e1, e2]
assert events.size() == 1