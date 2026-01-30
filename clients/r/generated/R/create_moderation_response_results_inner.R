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
#' @field category_applied_input_types  \link{CreateModerationResponseResultsInnerCategoryAppliedInputTypes}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateModerationResponseResultsInner <- R6::R6Class(
  "CreateModerationResponseResultsInner",
  public = list(
    `flagged` = NULL,
    `categories` = NULL,
    `category_scores` = NULL,
    `category_applied_input_types` = NULL,

    #' @description
    #' Initialize a new CreateModerationResponseResultsInner class.
    #'
    #' @param flagged Whether any of the below categories are flagged.
    #' @param categories categories
    #' @param category_scores category_scores
    #' @param category_applied_input_types category_applied_input_types
    #' @param ... Other optional arguments.
    initialize = function(`flagged`, `categories`, `category_scores`, `category_applied_input_types`, ...) {
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
      if (!missing(`category_applied_input_types`)) {
        stopifnot(R6::is.R6(`category_applied_input_types`))
        self$`category_applied_input_types` <- `category_applied_input_types`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CreateModerationResponseResultsInner as a base R list.
    #' @examples
    #' # convert array of CreateModerationResponseResultsInner (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CreateModerationResponseResultsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateModerationResponseResultsInnerObject <- list()
      if (!is.null(self$`flagged`)) {
        CreateModerationResponseResultsInnerObject[["flagged"]] <-
          self$`flagged`
      }
      if (!is.null(self$`categories`)) {
        CreateModerationResponseResultsInnerObject[["categories"]] <-
          self$`categories`$toSimpleType()
      }
      if (!is.null(self$`category_scores`)) {
        CreateModerationResponseResultsInnerObject[["category_scores"]] <-
          self$`category_scores`$toSimpleType()
      }
      if (!is.null(self$`category_applied_input_types`)) {
        CreateModerationResponseResultsInnerObject[["category_applied_input_types"]] <-
          self$`category_applied_input_types`$toSimpleType()
      }
      return(CreateModerationResponseResultsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationResponseResultsInner
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
      if (!is.null(this_object$`category_applied_input_types`)) {
        `category_applied_input_types_object` <- CreateModerationResponseResultsInnerCategoryAppliedInputTypes$new()
        `category_applied_input_types_object`$fromJSON(jsonlite::toJSON(this_object$`category_applied_input_types`, auto_unbox = TRUE, digits = NA))
        self$`category_applied_input_types` <- `category_applied_input_types_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateModerationResponseResultsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationResponseResultsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`flagged` <- this_object$`flagged`
      self$`categories` <- CreateModerationResponseResultsInnerCategories$new()$fromJSON(jsonlite::toJSON(this_object$`categories`, auto_unbox = TRUE, digits = NA))
      self$`category_scores` <- CreateModerationResponseResultsInnerCategoryScores$new()$fromJSON(jsonlite::toJSON(this_object$`category_scores`, auto_unbox = TRUE, digits = NA))
      self$`category_applied_input_types` <- CreateModerationResponseResultsInnerCategoryAppliedInputTypes$new()$fromJSON(jsonlite::toJSON(this_object$`category_applied_input_types`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateModerationResponseResultsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
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
      # check the required field `category_applied_input_types`
      if (!is.null(input_json$`category_applied_input_types`)) {
        stopifnot(R6::is.R6(input_json$`category_applied_input_types`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInner: the required field `category_applied_input_types` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateModerationResponseResultsInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
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

      # check if the required `category_applied_input_types` is null
      if (is.null(self$`category_applied_input_types`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
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

      # check if the required `category_applied_input_types` is null
      if (is.null(self$`category_applied_input_types`)) {
        invalid_fields["category_applied_input_types"] <- "Non-nullable required field `category_applied_input_types` cannot be null."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
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

