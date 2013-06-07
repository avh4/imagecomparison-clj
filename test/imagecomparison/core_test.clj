(ns imagecomparison.core-test
  (:use [imagecomparison.core])
  (:use [midje.sweet]))

(facts "about failing tests"
  (fact "they fail"
    (= 0 1) => true ))
