(ns imagecomparison.core-test
  (:use [imagecomparison.core])
  (:use [midje.sweet]))

(facts "about looks-like"
	(fact "it returns a function that accepts and argument"
    (looks-like "example.png") => fn?)
  (facts "about invoking the matching function"
    (fact "returns false when the reference file does not exist"
      ((looks-like "does-not-exist.png") .anything.) => false)))
