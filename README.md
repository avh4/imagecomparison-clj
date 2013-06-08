[![Build Status](https://secure.travis-ci.org/avh4/imagecomparison-clj.png?branch=master)](http://travis-ci.org/avh4/imagecomparison-clj)

# imagecomparison-clj

Tools for comparing images and writing image-based approval tests.

## Usage

Add the following dependencies to your `project.clj`:

```clojure
  [net.avh4.clj/imagecomparison "1.0.0"]
  [net.avh4.util/imagecomparison-swing "0.3.0"]
```

Use the `looks-like` checker in your midje tests:

```clojure
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

## License

Copyright © 2013 Aaron VonderHaar

Distributed under the Eclipse Public License, the same as Clojure.
