package ru.kpfu.itis.team1.android_summer_practice

object CityRepository {
    val list = listOf(
        City(id = 1, name = "London", country = "United Kingdom", imageUrl = "https://i2-prod.mirror.co.uk/incoming/article28871026.ece/ALTERNATES/s1200b/0_London-at-sunset.jpg", population = 8_799_800, area = 1572.03, description = "The largest urban economy in Europe, and it is one of the major financial centres in the world."),
        City(id = 2, name = "Paris", country = "France", imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/La_Tour_Eiffel_vue_de_la_Tour_Saint-Jacques%2C_Paris_ao%C3%BBt_2014_%282%29.jpg/1200px-La_Tour_Eiffel_vue_de_la_Tour_Saint-Jacques%2C_Paris_ao%C3%BBt_2014_%282%29.jpg", population = 2_102_650, area = 105.4, description = "The fourth-most populated city in the European Union as well as the 30th most densely populated city in the world in 2022."),
        City(id = 3, name = "Dubai", country = "United Arab Emirates", imageUrl = "https://media.cnn.com/api/v1/images/stellar/prod/200924183413-dubai-9-1.jpg?q=w_1350,h_900,x_125,y_0,c_crop", population = 3_564_931, area = 1610.0, description = "Established in the 18th century as a small fishing village, the city grew rapidly in the early 21st century with a focus on tourism and luxury."),
        City(id = 4, name = "New York City", country = "United States", imageUrl = "https://worldstrides.com/wp-content/uploads/2015/07/iStock_000040849990_Large.jpg", population = 8_804_190, area = 1223.59, description = "New York City is an important center for international diplomacy, and is sometimes described as the capital of the world."),
        City(id = 5, name = "Istanbul", country = "Turkey", imageUrl = "https://upload.wikimedia.org/wikipedia/commons/5/53/Bosphorus_Bridge_%28235499411%29.jpeg", population = 15_907_951, area = 2576.85, description = "The largest city in Turkey, serving as the country's economic, cultural and historic hub."),
        City(id = 6, name = "Moscow", country = "Russia", imageUrl = "https://www.planete-energies.com/sites/default/files/styles/1200x630/public/migrated_files/images/thumbnails/image/moscow.jpg?itok=lPt9jNWR", population = 13_010_112, area = 2561.5, description = "Moscow is among the world's largest cities, being the most populous city entirely in Europe, the largest urban and metropolitan area in Europe, and the largest city by land area on the European continent."),
        City(id = 7, name = "Tokyo", country = "Japan", imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Skyscrapers_of_Shinjuku_2009_January.jpg/1280px-Skyscrapers_of_Shinjuku_2009_January.jpg", population = 13_988_129, area = 2194.07, description = "Tokyo serves as Japan's economic center and is the seat of both the Japanese government and the Emperor of Japan."),
    )

    fun getById(id: Int?): City? = list.firstOrNull { it.id == id }
}
