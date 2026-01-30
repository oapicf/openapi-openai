#' Create a new PredictionContent
#'
#' @description
#' Static predicted output content, such as the content of a text file that is being regenerated. 
#'
#' @docType class
#' @title PredictionContent
#' @description PredictionContent Class
#' @format An \code{R6Class} generator object
#' @field type The type of the predicted content you want to provide. This type is currently always `content`. character
#' @field content  \link{PredictionContentContent}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PredictionContent <- R6::R6Class(
  "PredictionContent",
  public = list(
    `type` = NULL,
    `content` = NULL,

    #' @description
    #' Initialize a new PredictionContent class.
    #'
    #' @param type The type of the predicted content you want to provide. This type is currently always `content`.
    #' @param content content
    #' @param ... Other optional arguments.
    initialize = function(`type`, `content`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("content"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"content\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`content`)) {
        stopifnot(R6::is.R6(`content`))
        self$`content` <- `content`
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
    #' @return PredictionContent as a base R list.
    #' @examples
    #' # convert array of PredictionContent (x) to a data frame
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
    #' Convert PredictionContent to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PredictionContentObject <- list()
      if (!is.null(self$`type`)) {
        PredictionContentObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`content`)) {
        PredictionContentObject[["content"]] <-
          self$`content`$toSimpleType()
      }
      return(PredictionContentObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PredictionContent
    #'
    #' @param input_json the JSON input
    #' @return the instance of PredictionContent
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("content"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"content\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`content`)) {
        `content_object` <- PredictionContentContent$new()
        `content_object`$fromJSON(jsonlite::toJSON(this_object$`content`, auto_unbox = TRUE, digits = NA))
        self$`content` <- `content_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PredictionContent in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PredictionContent
    #'
    #' @param input_json the JSON input
    #' @return the instance of PredictionContent
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("content"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"content\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`content` <- PredictionContentContent$new()$fromJSON(jsonlite::toJSON(this_object$`content`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PredictionContent and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PredictionContent: the required field `type` is missing."))
      }
      # check the required field `content`
      if (!is.null(input_json$`content`)) {
        stopifnot(R6::is.R6(input_json$`content`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PredictionContent: the required field `content` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PredictionContent
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `content` is null
      if (is.null(self$`content`)) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `content` is null
      if (is.null(self$`content`)) {
        invalid_fields["content"] <- "Non-nullable required field `content` cannot be null."
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
# PredictionContent$unlock()
#
## Below is an example to define the print function
# PredictionContent$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PredictionContent$lock()

