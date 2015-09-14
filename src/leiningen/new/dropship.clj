(ns leiningen.new.dropship
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "dropship"))

(defn dropship
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' dropship project.")
    (->files data
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["test/{{sanitized}}/core_test.clj" (render "test.clj" data)]
             ["project.clj" (render "project.clj" data)]
             ["resources/routes.txt" (render "routes.txt" data)]
             [".gitignore" (render "gitignore" data)])))
