#' Create a new RunStepDeltaStepDetailsMessageCreationObject
#'
#' @description
#' Details of the message creation by the run step.
#'
#' @docType class
#' @title RunStepDeltaStepDetailsMessageCreationObject
#' @description RunStepDeltaStepDetailsMessageCreationObject Class
#' @format An \code{R6Class} generator object
#' @field type Always `message_creation`. character
#' @field message_creation  \link{RunStepDeltaStepDetailsMessageCreationObjectMessageCreation} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDeltaStepDetailsMessageCreationObject <- R6::R6Class(
  "RunStepDeltaStepDetailsMessageCreationObject",
  public = list(
    `type` = NULL,
    `message_creation` = NULL,

    #' @description
    #' Initialize a new RunStepDeltaStepDetailsMessageCreationObject class.
    #'
    #' @param type Always `message_creation`.
    #' @param message_creation message_creation
    #' @param ... Other optional arguments.
    initialize = function(`type`, `message_creation` = NULL, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("message_creation"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"message_creation\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`message_creation`)) {
        stopifnot(R6::is.R6(`message_creation`))
        self$`message_creation` <- `message_creation`
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
    #' @return RunStepDeltaStepDetailsMessageCreationObject as a base R list.
    #' @examples
    #' # convert array of RunStepDeltaStepDetailsMessageCreationObject (x) to a data frame
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
    #' Convert RunStepDeltaStepDetailsMessageCreationObject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunStepDeltaStepDetailsMessageCreationObjectObject <- list()
      if (!is.null(self$`type`)) {
        RunStepDeltaStepDetailsMessageCreationObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`message_creation`)) {
        RunStepDeltaStepDetailsMessageCreationObjectObject[["message_creation"]] <-
          self$`message_creation`$toSimpleType()
      }
      return(RunStepDeltaStepDetailsMessageCreationObjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsMessageCreationObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsMessageCreationObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("message_creation"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"message_creation\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`message_creation`)) {
        `message_creation_object` <- RunStepDeltaStepDetailsMessageCreationObjectMessageCreation$new()
        `message_creation_object`$fromJSON(jsonlite::toJSON(this_object$`message_creation`, auto_unbox = TRUE, digits = NA))
        self$`message_creation` <- `message_creation_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RunStepDeltaStepDetailsMessageCreationObject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsMessageCreationObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsMessageCreationObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("message_creation"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"message_creation\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`message_creation` <- RunStepDeltaStepDetailsMessageCreationObjectMessageCreation$new()$fromJSON(jsonlite::toJSON(this_object$`message_creation`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDeltaStepDetailsMessageCreationObject and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RunStepDeltaStepDetailsMessageCreationObject: the required field `type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDeltaStepDetailsMessageCreationObject
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
# RunStepDeltaStepDetailsMessageCreationObject$unlock()
#
## Below is an example to define the print function
# RunStepDeltaStepDetailsMessageCreationObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDeltaStepDetailsMessageCreationObject$lock()

