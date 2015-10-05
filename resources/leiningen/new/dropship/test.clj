(ns {{sanitized}}.core-test
  (:require [midje.sweet :refer :all]
            [{{sanitized}}.core :refer [handler]]
            [peridot.core :refer :all]))

(facts "Can get the status of the service"
       (fact "The service is alive when running"
             (-> (session handler)
                 (request "/status")
                 :response) => (contains {:status 200})))

