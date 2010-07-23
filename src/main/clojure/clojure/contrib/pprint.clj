;;; pprint.clj -- Pretty printer and Common Lisp compatible format function (cl-format) for Clojure

;; by Tom Faulhaber
;; April 3, 2009

;;   Copyright (c) Tom Faulhaber, April 2009. All rights reserved.
;;   The use and distribution terms for this software are covered by the
;;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;;   which can be found in the file epl-v10.html at the root of this distribution.
;;   By using this software in any fashion, you are agreeing to be bound by
;;   the terms of this license.
;;   You must not remove this notice, or any other, from this
;;   software.

;; DEPRECATED in 1.2.  Promoted to clojure.pprint

(ns 
    ^{:author "Tom Faulhaber",
      :deprecated "1.2"
      :doc "This module comprises two elements:
1) A pretty printer for Clojure data structures, implemented in the 
   function \"pprint\"
2) A Common Lisp compatible format function, implemented as 
   \"cl-format\" because Clojure is using the name \"format\" 
   for its Java-based format function.

See documentation for those functions for more information or complete 
documentation on the the clojure-contrib web site on github.",
       }
    clojure.contrib.pprint
  (:use clojure.contrib.pprint.utilities)
  (:use clojure.contrib.pprint.pretty-writer
        clojure.contrib.pprint.column-writer))


(load "pprint/pprint_base")
(load "pprint/cl_format")
(load "pprint/dispatch")

nil
