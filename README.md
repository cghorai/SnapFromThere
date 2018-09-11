# SnapFromThere
A recommendation engine to find a good location to take photos in current weather and time of day.

Basic flow - 
1. User opens app
2. The app should display map with photographic location recommendation
3. User input custom location
4. Map pans to that location and displays recommendation

Idea -
1. Get weather data (use google weather dataset) - Match with current weather and time to identify days in past in similar lighting condition.
2. User Flickr/500px API - Use metadata of images to get images taken on those days at same time in current location or a given radius of custom location
3. Sort images based on poplarity = (Views-Ratings)/Views. Kind of like heat map.
4. Impose the images as collapsed image ( similar to how Yelpl collapses and rates restaurants) on the map. 
