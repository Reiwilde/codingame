let enemy1
let enemy2
let distance1
let distance2

while (true) {
  enemy1 = readline()
  distance1 = Number.parseInt(readline(), 10)
  enemy2 = readline()
  distance2 = Number.parseInt(readline(), 10)
    
  print(distance1 < distance2 ? enemy1 : enemy2)
}
