#' Create a new TruncationObject
#'
#' @description
#' TruncationObject Class
#'
#' @docType class
#' @title TruncationObject
#' @description TruncationObject Class
#' @format An \code{R6Class} generator object
#' @field type The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`. character [optional]
#' @field last_messages The number of most recent messages from the thread when constructing the context for the run. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TruncationObject <- R6::R6Class(
  "TruncationObject",
  public = list(
    `type` = NULL,
    `last_messages` = NULL,

    #' @description
    #' Initialize a new TruncationObject class.
    #'
    #' @param type The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
    #' @param last_messages The number of most recent messages from the thread when constructing the context for the run.
    #' @param ... Other optional arguments.
    initialize = function(`type` = NULL, `last_messages` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c("auto", "last_messages"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"auto\", \"last_messages\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`last_messages`)) {
        if (!(is.numeric(`last_messages`) && length(`last_messages`) == 1)) {
          stop(paste("Error! Invalid data for `last_messages`. Must be an integer:", `last_messages`))
        }
        self$`last_messages` <- `last_messages`
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
    #' @return TruncationObject as a base R list.
    #' @examples
    #' # convert array of TruncationObject (x) to a data frame
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
    #' Convert TruncationObject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TruncationObjectObject <- list()
      if (!is.null(self$`type`)) {
        TruncationObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`last_messages`)) {
        TruncationObjectObject[["last_messages"]] <-
          self$`last_messages`
      }
      return(TruncationObjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TruncationObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of TruncationObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("auto", "last_messages"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"auto\", \"last_messages\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`last_messages`)) {
        self$`last_messages` <- this_object$`last_messages`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TruncationObject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TruncationObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of TruncationObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("auto", "last_messages"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"auto\", \"last_messages\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`last_messages` <- this_object$`last_messages`
      self
    },

    #' @description
    #' Validate JSON input with respect to TruncationObject and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TruncationObject
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (self$`last_messages` < 1) {
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
      if (self$`last_messages` < 1) {
        invalid_fields["last_messages"] <- "Invalid value for `last_messages`, must be bigger than or equal to 1."
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
# TruncationObject$unlock()
#
## Below is an example to define the print function
# TruncationObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TruncationObject$lock()

