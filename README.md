1.	Create graebert database using below command.
Create database graebert;
2.	Import the project as maven project into eclipse.
3.	Build the project by run as maven install database table will be created automatically.
4.	Below are the end point to save and fetch the record bases on requirement.
5.	To save record into database use below api localhost:8080/api/property/save to save property record into database.
Below are the three request to save record in database.


Save record into database
Media Type : Post
URI : localhost:8080/api/property/save
Request1
body:
{
	"bedRoom":2,
	"bathRoom":2,
	"propertyprice":1000000,
	"bedRoomDetail":
	[
		{
			"length":12,
			"width":11
		},
		{
			"length":10,
			"width":10
		}
	],
	"bathRoomDetail":
	[
		{
			"length":6,
			"width":6
		},{
			"length":8,
			"width":8
		}
	]
}

Request2
{
	"bedRoom":3,
	"bathRoom":2,
	"propertyprice":1000000,
	"bedRoomDetail":
	[
		{
			"length":12,
			"width":11
		},
		{
			"length":10,
			"width":10
		},
		{
			"length":13,
			"width":14
		}
	],
	"bathRoomDetail":
	[
		{
			"length":5,
			"width":5
		},{
			"length":7,
			"width":7
		}
	]
}


Request3
{
	"bedRoom":4,
	"bathRoom":3,
	"propertyprice":1000000,
	"bedRoomDetail":
	[
		{
			"length":11,
			"width":11
		},
		{
			"length":10,
			"width":10
		},
		{
			"length":13,
			"width":14
		},
			{
			"length":14,
			"width":14
		}
	],
	"bathRoomDetail":
	[
		{
			"length":5,
			"width":5
		},{
			"length":7,
			"width":9
		},
		{
			"length":5,
			"width":8
		}
	]
}



2. 
Price that he’s going to pay
Media Type: GET
localhost:8080/api/property/price?price=300000.2
Body: No
3. 
Fetch record for Minimum required number of bedrooms + minimum areas
Media Type: GET
URI: localhost:8080/api/property/bedroomandarea?bedroom=1&minimumArea=49
Body: No
4. 
Minimum required number of bathrooms + minimum areas
Media Type: GET
localhost:8080/api/property/bathroomandarea?bathroom=1&minimumArea=49
Body: No
5.
Minimum total area
Media Type: GET
body : no
localhost:8080/api/property/totalminarea?totalMinimumArea=120

