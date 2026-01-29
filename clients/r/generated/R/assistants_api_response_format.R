#' Create a new AssistantsApiResponseFormat
#'
#' @description
#' An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 
#'
#' @docType class
#' @title AssistantsApiResponseFormat
#' @description AssistantsApiResponseFormat Class
#' @format An \code{R6Class} generator object
#' @field type Must be one of `text` or `json_object`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssistantsApiResponseFormat <- R6::R6Class(
  "AssistantsApiResponseFormat",
  public = list(
    `type` = NULL,

    #' @description
    #' Initialize a new AssistantsApiResponseFormat class.
    #'
    #' @param type Must be one of `text` or `json_object`.. Default to "text".
    #' @param ... Other optional arguments.
    initialize = function(`type` = "text", ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c("text", "json_object"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"text\", \"json_object\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
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
    #' @return AssistantsApiResponseFormat as a base R list.
    #' @examples
    #' # convert array of AssistantsApiResponseFormat (x) to a data frame
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
    #' Convert AssistantsApiResponseFormat to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AssistantsApiResponseFormatObject <- list()
      if (!is.null(self$`type`)) {
        AssistantsApiResponseFormatObject[["type"]] <-
          self$`type`
      }
      return(AssistantsApiResponseFormatObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AssistantsApiResponseFormat
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantsApiResponseFormat
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("text", "json_object"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"text\", \"json_object\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AssistantsApiResponseFormat in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AssistantsApiResponseFormat
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantsApiResponseFormat
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("text", "json_object"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"text\", \"json_object\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self
    },

    #' @description
    #' Validate JSON input with respect to AssistantsApiResponseFormat and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssistantsApiResponseFormat
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# AssistantsApiResponseFormat$unlock()
#
## Below is an example to define the print function
# AssistantsApiResponseFormat$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssistantsApiResponseFormat$lock()

