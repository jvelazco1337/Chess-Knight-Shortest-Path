# Chess-Knight-Shortest-Path
Standard problem that calculates the shortest path going from one point of an 8X8 chess board to another of a knight piece.

While most solutions to this problem include either the Dijstra's algorithm, or an implementation of the BFS method, this
approach takes care of every possible scenario by following the picture provided in the files. Calculating the coordinates
for one box lets you get the coordinates of the other 3; picture a cartesian plane. Unless the coordinate lands on a 
horizontaly or vertically, which only have two possible options, the rest have 4.
