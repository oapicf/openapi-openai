#' Create a new CreateModerationResponseResultsInner
#'
#' @description
#' CreateModerationResponseResultsInner Class
#'
#' @docType class
#' @title CreateModerationResponseResultsInner
#' @description CreateModerationResponseResultsInner Class
#' @format An \code{R6Class} generator object
#' @field flagged Whether any of the below categories are flagged. character
#' @field categories  \link{CreateModerationResponseResultsInnerCategories}
#' @field category_scores  \link{CreateModerationResponseResultsInnerCategoryScores}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateModerationResponseResultsInner <- R6::R6Class(
  "CreateModerationResponseResultsInner",
  public = list(
    `flagged` = NULL,
    `categories` = NULL,
    `category_scores` = NULL,
    #' Initialize a new CreateModerationResponseResultsInner class.
    #'
    #' @description
    #' Initialize a new CreateModerationResponseResultsInner class.
    #'
    #' @param flagged Whether any of the below categories are flagged.
    #' @param categories categories
    #' @param category_scores category_scores
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`flagged`, `categories`, `category_scores`, ...) {
      if (!missing(`flagged`)) {
        if (!(is.logical(`flagged`) && length(`flagged`) == 1)) {
          stop(paste("Error! Invalid data for `flagged`. Must be a boolean:", `flagged`))
        }
        self$`flagged` <- `flagged`
      }
      if (!missing(`categories`)) {
        stopifnot(R6::is.R6(`categories`))
        self$`categories` <- `categories`
      }
      if (!missing(`category_scores`)) {
        stopifnot(R6::is.R6(`category_scores`))
        self$`category_scores` <- `category_scores`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateModerationResponseResultsInner in JSON format
    #' @export
    toJSON = function() {
      CreateModerationResponseResultsInnerObject <- list()
      if (!is.null(self$`flagged`)) {
        CreateModerationResponseResultsInnerObject[["flagged"]] <-
          self$`flagged`
      }
      if (!is.null(self$`categories`)) {
        CreateModerationResponseResultsInnerObject[["categories"]] <-
          self$`categories`$toJSON()
      }
      if (!is.null(self$`category_scores`)) {
        CreateModerationResponseResultsInnerObject[["category_scores"]] <-
          self$`category_scores`$toJSON()
      }
      CreateModerationResponseResultsInnerObject
    },
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationResponseResultsInner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`flagged`)) {
        self$`flagged` <- this_object$`flagged`
      }
      if (!is.null(this_object$`categories`)) {
        `categories_object` <- CreateModerationResponseResultsInnerCategories$new()
        `categories_object`$fromJSON(jsonlite::toJSON(this_object$`categories`, auto_unbox = TRUE, digits = NA))
        self$`categories` <- `categories_object`
      }
      if (!is.null(this_object$`category_scores`)) {
        `category_scores_object` <- CreateModerationResponseResultsInnerCategoryScores$new()
        `category_scores_object`$fromJSON(jsonlite::toJSON(this_object$`category_scores`, auto_unbox = TRUE, digits = NA))
        self$`category_scores` <- `category_scores_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateModerationResponseResultsInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`flagged`)) {
          sprintf(
          '"flagged":
            %s
                    ',
          tolower(self$`flagged`)
          )
        },
        if (!is.null(self$`categories`)) {
          sprintf(
          '"categories":
          %s
          ',
          jsonlite::toJSON(self$`categories`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`category_scores`)) {
          sprintf(
          '"category_scores":
          %s
          ',
          jsonlite::toJSON(self$`category_scores`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationResponseResultsInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`flagged` <- this_object$`flagged`
      self$`categories` <- CreateModerationResponseResultsInnerCategories$new()$fromJSON(jsonlite::toJSON(this_object$`categories`, auto_unbox = TRUE, digits = NA))
      self$`category_scores` <- CreateModerationResponseResultsInnerCategoryScores$new()$fromJSON(jsonlite::toJSON(this_object$`category_scores`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CreateModerationResponseResultsInner
    #'
    #' @description
    #' Validate JSON input with respect to CreateModerationResponseResultsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `flagged`
      if (!is.null(input_json$`flagged`)) {
        if (!(is.logical(input_json$`flagged`) && length(input_json$`flagged`) == 1)) {
          stop(paste("Error! Invalid data for `flagged`. Must be a boolean:", input_json$`flagged`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInner: the required field `flagged` is missing."))
      }
      # check the required field `categories`
      if (!is.null(input_json$`categories`)) {
        stopifnot(R6::is.R6(input_json$`categories`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInner: the required field `categories` is missing."))
      }
      # check the required field `category_scores`
      if (!is.null(input_json$`category_scores`)) {
        stopifnot(R6::is.R6(input_json$`category_scores`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInner: the required field `category_scores` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateModerationResponseResultsInner
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `flagged` is null
      if (is.null(self$`flagged`)) {
        return(FALSE)
      }

      # check if the required `categories` is null
      if (is.null(self$`categories`)) {
        return(FALSE)
      }

      # check if the required `category_scores` is null
      if (is.null(self$`category_scores`)) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `flagged` is null
      if (is.null(self$`flagged`)) {
        invalid_fields["flagged"] <- "Non-nullable required field `flagged` cannot be null."
      }

      # check if the required `categories` is null
      if (is.null(self$`categories`)) {
        invalid_fields["categories"] <- "Non-nullable required field `categories` cannot be null."
      }

      # check if the required `category_scores` is null
      if (is.null(self$`category_scores`)) {
        invalid_fields["category_scores"] <- "Non-nullable required field `category_scores` cannot be null."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CreateModerationResponseResultsInner$unlock()
#
## Below is an example to define the print function
# CreateModerationResponseResultsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateModerationResponseResultsInner$lock()

