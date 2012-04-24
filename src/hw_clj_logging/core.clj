(ns hw-clj-logging.core
  (:use [clojure.tools.logging :only (info error debug)]))

(defn -main
  [& args]
  (debug "You may see this")
  (info "Hello, World!"))
