#include <cstdint>
#include <iostream>
#include <string>

int main()
{
  using std::cin;
  using std::int16_t;
  using std::uint16_t;
  
  uint16_t surfaceN;
    
  cin >> surfaceN;
  
  for (int i = 0; i < surfaceN; i++) {
    uint16_t landX, landY;
    cin >> landX >> landY;
  }

  for (;;) {
    int16_t hSpeed, vSpeed, rotate;
    uint16_t x, y, fuel, power;

    cin >> x >> y >> hSpeed >> vSpeed >> fuel >> rotate >> power;

    std::cout << ((vSpeed <= -40) ? "0 4" : "0 0") << std::endl;
  }
}
