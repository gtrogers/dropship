(ns {{sanitized}}.core
  (:gen-class)
  (:use [org.httpkit.server :only [run-server]])
  (:require [scenic.routes :refer :all]
            [ring.util.response :as r]
            [ring.middleware.json :refer [wrap-json-response]]))

(def _handler (scenic-handler (load-routes-from-file "routes.txt")
                              {:status (fn [request] (r/response {:server "alive"}))}))

(def handler (-> _handler
                 wrap-json-response))

(def port 7000)
(def server (atom nil))

(defn start-server [port]
  (reset! server (run-server handler {:port port})))

(defn -main
  ""
  [& args]
  (prn "starting server...")
  (start-server port))
