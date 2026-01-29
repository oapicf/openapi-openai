#' Create a new AssistantsApiNamedToolChoice
#'
#' @description
#' Specifies a tool the model should use. Use to force the model to call a specific tool.
#'
#' @docType class
#' @title AssistantsApiNamedToolChoice
#' @description AssistantsApiNamedToolChoice Class
#' @format An \code{R6Class} generator object
#' @field type The type of the tool. If type is `function`, the function name must be set character
#' @field function  \link{ChatCompletionNamedToolChoiceFunction} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssistantsApiNamedToolChoice <- R6::R6Class(
  "AssistantsApiNamedToolChoice",
  public = list(
    `type` = NULL,
    `function` = NULL,

    #' @description
    #' Initialize a new AssistantsApiNamedToolChoice class.
    #'
    #' @param type The type of the tool. If type is `function`, the function name must be set
    #' @param function function
    #' @param ... Other optional arguments.
    initialize = function(`type`, `function` = NULL, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("function", "code_interpreter", "retrieval"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"function\", \"code_interpreter\", \"retrieval\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`function`)) {
        stopifnot(R6::is.R6(`function`))
        self$`function` <- `function`
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
    #' @return AssistantsApiNamedToolChoice as a base R list.
    #' @examples
    #' # convert array of AssistantsApiNamedToolChoice (x) to a data frame
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
    #' Convert AssistantsApiNamedToolChoice to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AssistantsApiNamedToolChoiceObject <- list()
      if (!is.null(self$`type`)) {
        AssistantsApiNamedToolChoiceObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`function`)) {
        AssistantsApiNamedToolChoiceObject[["function"]] <-
          self$`function`$toSimpleType()
      }
      return(AssistantsApiNamedToolChoiceObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AssistantsApiNamedToolChoice
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantsApiNamedToolChoice
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("function", "code_interpreter", "retrieval"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"function\", \"code_interpreter\", \"retrieval\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`function`)) {
        `Function__object` <- ChatCompletionNamedToolChoiceFunction$new()
        `Function__object`$fromJSON(jsonlite::toJSON(this_object$`function`, auto_unbox = TRUE, digits = NA))
        self$`function` <- `Function__object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AssistantsApiNamedToolChoice in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AssistantsApiNamedToolChoice
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantsApiNamedToolChoice
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("function", "code_interpreter", "retrieval"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"function\", \"code_interpreter\", \"retrieval\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`function` <- ChatCompletionNamedToolChoiceFunction$new()$fromJSON(jsonlite::toJSON(this_object$`function`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AssistantsApiNamedToolChoice and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for AssistantsApiNamedToolChoice: the required field `type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssistantsApiNamedToolChoice
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
# AssistantsApiNamedToolChoice$unlock()
#
## Below is an example to define the print function
# AssistantsApiNamedToolChoice$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssistantsApiNamedToolChoice$lock()

