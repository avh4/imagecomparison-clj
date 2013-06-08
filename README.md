[![Build Status](https://secure.travis-ci.org/avh4/imagecomparison-clj.png?branch=master)](http://travis-ci.org/avh4/imagecomparison-clj)

# imagecomparison-clj

Tools for comparing images and writing image-based approval tests.

## Usage

Add the following dependencies to your `project.clj`:

```clojure
  [net.avh4.clj/imagecomparison "1.0.0"]
  [net.avh4.util/imagecomparison-swing "0.3.0"]
```

Use the `looks-like` checker in your [midje](https://github.com/marick/Midje) tests:

```clojure
(use 'imagecomparison.core)

(facts "about my JComponent subclass"
  (fact "it draws a snazzy dashboard"
    (MyJComponent. ) => (looks-like "snazzy-dashboard.png")))
```

You'll probably see something like this:

```
FAIL "about my JComponent subclass - it draws a snazzy dashboard" at (core_test.clj:6)
Actual result did not agree with the checking function.
        Actual result: #<MyJComponent[,0,0,800x600,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]>
    Checking function: (looks-like "snazzy-dashboard.png")
    The checker said this about the reason:
        First incorrect pixel was (0, 0): expected 0xffc7613e, but got 0x0
        actual image saved as ./actual-snazzy-dashboard.png
FAILURE: 1 check failed. 
```

### What you can test

The `looks-like` checker currently can check the following types of objects:

* `java.awt.image.BufferedImage`
* `java.awt.Component` (which includes `javax.swing.JComponent`)
* `javax.swing.JFrame`

Additional renderers can be added by implementing `net.avh4.util.imagerender.Renderer` and registering in `META-INF/services`
(see [imagecomparison-java](https://github.com/avh4/imagecomparison), and [ServiceLoader](http://docs.oracle.com/javase/6/docs/api/java/util/ServiceLoader.html)).

## License

Copyright © 2013 Aaron VonderHaar

Distributed under the Eclipse Public License, the same as Clojure.
