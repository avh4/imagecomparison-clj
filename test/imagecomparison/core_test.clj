(ns imagecomparison.core-test
  (:use [imagecomparison.core])
  (:use [midje.sweet]))

(facts "about looks-like"
	(fact "it returns a function"
    (looks-like "example.png") => fn?)
  (facts "about invoking the matching function"
    (fact "returns false when the reference file does not exist"
      ((looks-like "does-not-exist.png") "example.png") => false)
    (fact "returns true when the reference file matches the actual image"
      ((looks-like "example.png") "example.png") => true)))
