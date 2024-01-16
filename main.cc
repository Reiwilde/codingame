#include <cstdint>
#include <iostream>
#include <string>

int main()
{
  for (;;) {
    std::string enemy1, enemy2;
    std::uint16_t distance1, distance2;
    
    std::cin >> enemy1 >> distance1 >> enemy2 >> distance2;
    std::cout << ((distance1 < distance2) ? enemy1 : enemy2) << std::endl;
  }
}
