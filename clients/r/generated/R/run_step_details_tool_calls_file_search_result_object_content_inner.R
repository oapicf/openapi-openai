#' Create a new RunStepDetailsToolCallsFileSearchResultObjectContentInner
#'
#' @description
#' RunStepDetailsToolCallsFileSearchResultObjectContentInner Class
#'
#' @docType class
#' @title RunStepDetailsToolCallsFileSearchResultObjectContentInner
#' @description RunStepDetailsToolCallsFileSearchResultObjectContentInner Class
#' @format An \code{R6Class} generator object
#' @field type The type of the content. character [optional]
#' @field text The text content of the file. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDetailsToolCallsFileSearchResultObjectContentInner <- R6::R6Class(
  "RunStepDetailsToolCallsFileSearchResultObjectContentInner",
  public = list(
    `type` = NULL,
    `text` = NULL,

    #' @description
    #' Initialize a new RunStepDetailsToolCallsFileSearchResultObjectContentInner class.
    #'
    #' @param type The type of the content.
    #' @param text The text content of the file.
    #' @param ... Other optional arguments.
    initialize = function(`type` = NULL, `text` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c("text"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"text\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`text`)) {
        if (!(is.character(`text`) && length(`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", `text`))
        }
        self$`text` <- `text`
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
    #' @return RunStepDetailsToolCallsFileSearchResultObjectContentInner as a base R list.
    #' @examples
    #' # convert array of RunStepDetailsToolCallsFileSearchResultObjectContentInner (x) to a data frame
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
    #' Convert RunStepDetailsToolCallsFileSearchResultObjectContentInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunStepDetailsToolCallsFileSearchResultObjectContentInnerObject <- list()
      if (!is.null(self$`type`)) {
        RunStepDetailsToolCallsFileSearchResultObjectContentInnerObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`text`)) {
        RunStepDetailsToolCallsFileSearchResultObjectContentInnerObject[["text"]] <-
          self$`text`
      }
      return(RunStepDetailsToolCallsFileSearchResultObjectContentInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsFileSearchResultObjectContentInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsFileSearchResultObjectContentInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("text"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"text\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`text`)) {
        self$`text` <- this_object$`text`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RunStepDetailsToolCallsFileSearchResultObjectContentInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsFileSearchResultObjectContentInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsFileSearchResultObjectContentInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("text"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"text\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`text` <- this_object$`text`
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDetailsToolCallsFileSearchResultObjectContentInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDetailsToolCallsFileSearchResultObjectContentInner
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
# RunStepDetailsToolCallsFileSearchResultObjectContentInner$unlock()
#
## Below is an example to define the print function
# RunStepDetailsToolCallsFileSearchResultObjectContentInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDetailsToolCallsFileSearchResultObjectContentInner$lock()

