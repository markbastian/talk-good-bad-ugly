# clj-pres

A Clojure library designed to ... well, that part is up to you.

## Usage

To make an awesome presentation using only Clojure, do the following:

1. In the presentations directory, add whatever bower dependencies you require for your presentation to bower.json.
2. Run bower install to update your libraries.
3. Run lein cleantest to build the reveal-cl.js file needed for the presentation.

Note: You only need to do the above when you change your library dependencies.

3. Create a package for your presentation in src/clj for your presentation and start editing.
4. Call reveal/write-presentation when you are all done.

Take a look at one of the existing presentations (e.g. fp) for an example.

Hint: If you work in LightTable, open your presentation file in an instarepl and your output file in a web browser.
Now, whenever you save your presentation you can just refresh your browser and bam! new presentation.

## License

Copyright © 2015 Mark Bastian

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
