Currently kind of works. But missing two
important pieces:

- `.nrepl-port` file for connecting with vim-fireplace
- Rebuild source when changes


First can be solved with something like https://nrepl.xyz/nrepl/usage/server.html#_using_clojure_cli_tools
but it's missing firing up the server + a browser repl, so doesn't really work.

Currently what works:

- Building
- Serving the output

Achieved with the following commands:

```
clj -m cljs.main -co build.edn -v -c
clj -m cljs.main -s
```
