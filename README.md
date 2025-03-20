1) http://localhost:8080/v1/usersScores/{userId}
Response:
   {
       "userId": 2,
       "assessments": [
           {
           "courseId": 2,
           "assessmentId": 2,
           "dtSubmitted": "03/20/25",
           "score": {
               "pointsEarned": 9,
               "pointsPossible": 10
            }
           },
           {
           "courseId": 1,
           "assessmentId": 1,
           "dtSubmitted": "03/20/25",
           "score": {
               "pointsEarned": 8,
               "pointsPossible": 10
            }
           }
       ]
   }
   2) http://localhost:8080/v1/usersScores
   Response:
      [
      {
      "userId": 1,
      "assessments": [
          {
          "courseId": 1,
          "assessmentId": 1,
          "dtSubmitted": "03/20/25",
          "score": {
              "pointsEarned": 9,
              "pointsPossible": 10
            }
          },
          {
          "courseId": 2,
          "assessmentId": 2,
          "dtSubmitted": "03/20/25",
          "score": {
              "pointsEarned": 9.5,
              "pointsPossible": 10
            }
          }
        ]
      },
      {
      "userId": 2,
      "assessments": [
      {
      "courseId": 2,
      "assessmentId": 2,
      "dtSubmitted": "03/20/25",
      "score": {
          "pointsEarned": 9,
          "pointsPossible": 10
        }
      },
      {
      "courseId": 1,
      "assessmentId": 1,
      "dtSubmitted": "03/20/25",
      "score": {
          "pointsEarned": 8,
          "pointsPossible": 10
        }
      }
      ]
      }
      ]