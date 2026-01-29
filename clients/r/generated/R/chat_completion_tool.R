#' Create a new ChatCompletionTool
#'
#' @description
#' ChatCompletionTool Class
#'
#' @docType class
#' @title ChatCompletionTool
#' @description ChatCompletionTool Class
#' @format An \code{R6Class} generator object
#' @field type The type of the tool. Currently, only `function` is supported. character
#' @field function  \link{FunctionObject}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionTool <- R6::R6Class(
  "ChatCompletionTool",
  public = list(
    `type` = NULL,
    `function` = NULL,

    #' @description
    #' Initialize a new ChatCompletionTool class.
    #'
    #' @param type The type of the tool. Currently, only `function` is supported.
    #' @param function function
    #' @param ... Other optional arguments.
    initialize = function(`type`, `function`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("function"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"function\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`function`)) {
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
    #' @return ChatCompletionTool as a base R list.
    #' @examples
    #' # convert array of ChatCompletionTool (x) to a data frame
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
    #' Convert ChatCompletionTool to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ChatCompletionToolObject <- list()
      if (!is.null(self$`type`)) {
        ChatCompletionToolObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`function`)) {
        ChatCompletionToolObject[["function"]] <-
          self$`function`$toSimpleType()
      }
      return(ChatCompletionToolObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionTool
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionTool
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("function"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"function\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`function`)) {
        `Function__object` <- FunctionObject$new()
        `Function__object`$fromJSON(jsonlite::toJSON(this_object$`function`, auto_unbox = TRUE, digits = NA))
        self$`function` <- `Function__object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ChatCompletionTool in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionTool
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionTool
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("function"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"function\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`function` <- FunctionObject$new()$fromJSON(jsonlite::toJSON(this_object$`function`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ChatCompletionTool and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionTool: the required field `type` is missing."))
      }
      # check the required field `function`
      if (!is.null(input_json$`function`)) {
        stopifnot(R6::is.R6(input_json$`function`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionTool: the required field `function` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionTool
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

      # check if the required `function` is null
      if (is.null(self$`function`)) {
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

      # check if the required `function` is null
      if (is.null(self$`function`)) {
        invalid_fields["function"] <- "Non-nullable required field `function` cannot be null."
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
# ChatCompletionTool$unlock()
#
## Below is an example to define the print function
# ChatCompletionTool$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionTool$lock()

