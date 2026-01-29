#' Create a new RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
#'
#' @description
#' RunStepDeltaStepDetailsMessageCreationObjectMessageCreation Class
#'
#' @docType class
#' @title RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
#' @description RunStepDeltaStepDetailsMessageCreationObjectMessageCreation Class
#' @format An \code{R6Class} generator object
#' @field message_id The ID of the message that was created by this run step. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDeltaStepDetailsMessageCreationObjectMessageCreation <- R6::R6Class(
  "RunStepDeltaStepDetailsMessageCreationObjectMessageCreation",
  public = list(
    `message_id` = NULL,

    #' @description
    #' Initialize a new RunStepDeltaStepDetailsMessageCreationObjectMessageCreation class.
    #'
    #' @param message_id The ID of the message that was created by this run step.
    #' @param ... Other optional arguments.
    initialize = function(`message_id` = NULL, ...) {
      if (!is.null(`message_id`)) {
        if (!(is.character(`message_id`) && length(`message_id`) == 1)) {
          stop(paste("Error! Invalid data for `message_id`. Must be a string:", `message_id`))
        }
        self$`message_id` <- `message_id`
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
    #' @return RunStepDeltaStepDetailsMessageCreationObjectMessageCreation as a base R list.
    #' @examples
    #' # convert array of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation (x) to a data frame
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
    #' Convert RunStepDeltaStepDetailsMessageCreationObjectMessageCreation to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunStepDeltaStepDetailsMessageCreationObjectMessageCreationObject <- list()
      if (!is.null(self$`message_id`)) {
        RunStepDeltaStepDetailsMessageCreationObjectMessageCreationObject[["message_id"]] <-
          self$`message_id`
      }
      return(RunStepDeltaStepDetailsMessageCreationObjectMessageCreationObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`message_id`)) {
        self$`message_id` <- this_object$`message_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RunStepDeltaStepDetailsMessageCreationObjectMessageCreation in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`message_id` <- this_object$`message_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDeltaStepDetailsMessageCreationObjectMessageCreation and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
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
# RunStepDeltaStepDetailsMessageCreationObjectMessageCreation$unlock()
#
## Below is an example to define the print function
# RunStepDeltaStepDetailsMessageCreationObjectMessageCreation$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDeltaStepDetailsMessageCreationObjectMessageCreation$lock()

