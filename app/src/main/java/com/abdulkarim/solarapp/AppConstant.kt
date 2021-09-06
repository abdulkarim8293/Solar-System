package com.abdulkarim.solarapp

class AppConstant {

    companion object {

        const val MERCURY = "Mercury"
        const val VENUS = "Venus"
        const val EARTH = "Earth"
        const val MARS = "Mars"
        const val JUPITER = "Jupiter"
        const val SATURN = "Saturn"
        const val URANUS = "Uranus"
        const val NEPTUNE = "Neptune"

        const val SIZE_OF_MERCURY = "1,516mi (2,440km) radius; about 1/3 the size of Earth"
        const val SIZE_OF_VENUS = "3,760mi (6,052km) radius; only slightly smaller than Earth"
        const val SIZE_OF_EARTH = "3,959mi (6,371km) radius"
        const val SIZE_OF_MARS = "2,106mi (3,390km) radius; about half the size of Earth"
        const val SIZE_OF_JUPITER = "43,441mi (69,911km) radius; 11x Earth’s size"
        const val SIZE_OF_SATURN = "36,184mi (58,232km) radius; 9x larger than Earth"
        const val SIZE_OF_URANUS = "15,759mi (25,362km) radius; 4x Earth’s size"
        const val SIZE_OF_NEPTUNE = "15,299mi (24,622km) radius; only slightly smaller than Uranus"

        const val DESCRIPTION_OF_MERCURY ="Mercury is the smallest planet in our solar system. ... Along with Venus, Earth, and Mars, Mercury is one of the rocky planets. It has a solid surface that is covered with craters. It has no atmosphere, and it doesn't have any moons."
        const val DESCRIPTION_OF_VENUS ="Venus is the second planet from the Sun, and is Earth's closest neighbor in the solar system. Venus is the brightest object in the sky after the Sun and the Moon, and sometimes looks like a bright star in the morning or evening sky. The planet is a little smaller than Earth, and is similar to Earth inside"
        const val DESCRIPTION_OF_EARTH ="Our home planet Earth is a rocky, terrestrial planet. It has a solid and active surface with mountains, valleys, canyons, plains and so much more. Earth is special because it is an ocean planet. Water covers 70% of Earth's surface."
        const val DESCRIPTION_OF_MARS ="Mars is the fourth planet from the Sun and the second-smallest planet in the Solar System, being larger than only Mercury. ... Mars is a terrestrial planet with a thin atmosphere, with surface features reminiscent of the impact craters of the Moon and the valleys, deserts and polar ice caps of Earth."
        const val DESCRIPTION_OF_JUPITER ="Jupiter is the fifth planet from the Sun and the largest in the Solar System. It is a gas giant with a mass more than two and a half times that of all the other planets in the Solar System combined, but slightly less than one-thousandth the mass of the Sun."
        const val DESCRIPTION_OF_SATURN = "Saturn is a gas giant made up mostly of hydrogen and helium. Saturn's volume is greater than 760 Earths, and it is the second most massive planet in the solar system, about 95 times Earth's mass. The Ringed Planet is the least dense of all the planets, and is the only one less dense than water."
        const val DESCRIPTION_OF_URANUS ="The planet is often dubbed an ice giant, since at least 80% of its mass is a fluid mix of water, methane and ammonia ice. Unlike the other planets of the solar system, Uranus is tilted so far that it essentially orbits the sun on its side, with the axis of its spin nearly pointing at the star."
        const val DESCRIPTION_OF_NEPTUNE ="Neptune is dark, cold, and very windy. It's the last of the planets in our solar system. ... Neptune is very similar to Uranus. It's made of a thick soup of water, ammonia, and methane over an Earth-sized solid center"

        const val IMAGE_URL_OF_MERCURY = "https://www.google.com/search?q=mercury+image&client=firefox-b-d&tbm=isch&source=iu&ictx=1&fir=1rIHNLnW8w-aXM%252CgKvybZWLyl4sEM%252C_&vet=1&usg=AI4_-kQvtdP8AKuHlye4iqbukblivRyR_w&sa=X&ved=2ahUKEwiBg4T74unyAhXm-nMBHSuzBXQQ9QF6BAgcEAE&biw=1920&bih=955"
        const val IMAGE_URL_OF_VENUS = "https://www.google.com/search?q=Venus+image&tbm=isch&ved=2ahUKEwjoq5WA4-nyAhWoitgFHephBngQ2-cCegQIABAA&oq=Venus+image&gs_lcp=CgNpbWcQDDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQ6BggAEAcQHlDz_klYm4dKYOuQSmgAcAB4AIABtwGIAesCkgEDMC4ymAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=Rbw1Yaj1BaiV4t4P6sOZwAc&bih=955&biw=1920&client=firefox-b-d#imgrc=DK4DSH1ZtLfHCM"
        const val IMAGE_URL_OF_EARTH = "https://www.google.com/search?q=earth+image&tbm=isch&ved=2ahUKEwiOgYTE5-nyAhV2I7cAHRI0BLMQ2-cCegQIABAA&oq=earth+image&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQ6BggAEAcQHjoECAAQQzoHCAAQsQMQQzoICAAQgAQQsQM6CwgAEIAEELEDEIMBUPqZB1jOugdgt74HaAVwAHgAgAGfA4gBuAySAQkwLjUuMS4wLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=BcE1Yc7qCfbG3LUPkuiQmAs&bih=955&biw=1920&client=firefox-b-d#imgrc=b1U95v9mRKTocM"
        const val IMAGE_URL_OF_MARS = "https://www.google.com/search?q=mars+image&tbm=isch&ved=2ahUKEwjgoK__5-nyAhV0luYKHW2lAeEQ2-cCegQIABAA&oq=mars+image&gs_lcp=CgNpbWcQAzIECAAQQzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDoGCAAQBxAeUOT8AliVlQNgk5gDaABwAHgAgAH6AYgB0QeSAQUwLjQuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=gcE1YaDcJPSsmgftyoaIDg&bih=955&biw=1920&client=firefox-b-d#imgrc=8iz55Ga5lBj4aM"
        const val IMAGE_URL_OF_JUPITER = "https://www.google.com/search?q=jupiter+image&tbm=isch&ved=2ahUKEwiX3vyY6OnyAhVFKbcAHa7PCkkQ2-cCegQIABAA&oq=jupiter+image&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQ6BggAEAcQHjoECAAQQzoHCAAQsQMQQzoICAAQgAQQsQNQwcICWOToAmCk6wJoA3AAeACAAYQCiAGCDpIBBTAuNy4ymAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=t8E1YdemEsXS3LUPrp-ryAQ&bih=955&biw=1920&client=firefox-b-d#imgrc=ZADlLUm55SksvM"
        const val IMAGE_URL_OF_SATURN = "https://www.google.com/search?q=staurn+image&tbm=isch&ved=2ahUKEwjMuu2v6OnyAhWkJrcAHUi9Ak0Q2-cCegQIABAA&oq=staurn+image&gs_lcp=CgNpbWcQAzIGCAAQChAYOgUIABCABDoGCAAQBxAeUL2wBFiazQRgws8EaABwAHgAgAG-AYgBhAqSAQMwLjeYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=58E1YYyrEaTN3LUPyPqK6AQ&bih=955&biw=1920&client=firefox-b-d#imgrc=SKMievfTr8MzyM"
        const val IMAGE_URL_OF_URANUS = "https://www.google.com/search?q=uranus+image&tbm=isch&ved=2ahUKEwj7vtHU6OnyAhX803MBHXA9BpwQ2-cCegQIABAA&oq=uranus+image&gs_lcp=CgNpbWcQAzIECAAQQzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDoGCAAQBxAeUOXzAlikkwNg5ZcDaARwAHgAgAHeAogBqQqSAQcwLjQuMS4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=NMI1YfvUGfynz7sP8PqY4Ak&bih=955&biw=1920&client=firefox-b-d#imgrc=2-BGEIAJqI20dM"
        const val IMAGE_URL_OF_NEPTUNE = "https://www.google.com/search?q=neptune+image&tbm=isch&ved=2ahUKEwiksJju6OnyAhUtA7cAHUQhCfcQ2-cCegQIABAA&oq=neptune+image&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQ6BggAEAcQHlDZ1ANYspEEYLWTBGgBcAB4AIAB_AGIAawNkgEFMC43LjKYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=asI1YaRTrYbctQ_EwqS4Dw&bih=955&biw=1920&client=firefox-b-d#imgrc=KkgIjr0DIq68aM"

    }

}