#' Create a new CreateChatCompletionFunctionResponseChoicesInner
#'
#' @description
#' CreateChatCompletionFunctionResponseChoicesInner Class
#'
#' @docType class
#' @title CreateChatCompletionFunctionResponseChoicesInner
#' @description CreateChatCompletionFunctionResponseChoicesInner Class
#' @format An \code{R6Class} generator object
#' @field finish_reason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. character
#' @field index The index of the choice in the list of choices. integer
#' @field message  \link{ChatCompletionResponseMessage}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateChatCompletionFunctionResponseChoicesInner <- R6::R6Class(
  "CreateChatCompletionFunctionResponseChoicesInner",
  public = list(
    `finish_reason` = NULL,
    `index` = NULL,
    `message` = NULL,

    #' @description
    #' Initialize a new CreateChatCompletionFunctionResponseChoicesInner class.
    #'
    #' @param finish_reason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function.
    #' @param index The index of the choice in the list of choices.
    #' @param message message
    #' @param ... Other optional arguments.
    initialize = function(`finish_reason`, `index`, `message`, ...) {
      if (!missing(`finish_reason`)) {
        if (!(`finish_reason` %in% c("stop", "length", "function_call", "content_filter"))) {
          stop(paste("Error! \"", `finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\", \"function_call\", \"content_filter\".", sep = ""))
        }
        if (!(is.character(`finish_reason`) && length(`finish_reason`) == 1)) {
          stop(paste("Error! Invalid data for `finish_reason`. Must be a string:", `finish_reason`))
        }
        self$`finish_reason` <- `finish_reason`
      }
      if (!missing(`index`)) {
        if (!(is.numeric(`index`) && length(`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", `index`))
        }
        self$`index` <- `index`
      }
      if (!missing(`message`)) {
        stopifnot(R6::is.R6(`message`))
        self$`message` <- `message`
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
    #' @return CreateChatCompletionFunctionResponseChoicesInner as a base R list.
    #' @examples
    #' # convert array of CreateChatCompletionFunctionResponseChoicesInner (x) to a data frame
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
    #' Convert CreateChatCompletionFunctionResponseChoicesInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateChatCompletionFunctionResponseChoicesInnerObject <- list()
      if (!is.null(self$`finish_reason`)) {
        CreateChatCompletionFunctionResponseChoicesInnerObject[["finish_reason"]] <-
          self$`finish_reason`
      }
      if (!is.null(self$`index`)) {
        CreateChatCompletionFunctionResponseChoicesInnerObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`message`)) {
        CreateChatCompletionFunctionResponseChoicesInnerObject[["message"]] <-
          self$`message`$toSimpleType()
      }
      return(CreateChatCompletionFunctionResponseChoicesInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionFunctionResponseChoicesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionFunctionResponseChoicesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`finish_reason`)) {
        if (!is.null(this_object$`finish_reason`) && !(this_object$`finish_reason` %in% c("stop", "length", "function_call", "content_filter"))) {
          stop(paste("Error! \"", this_object$`finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\", \"function_call\", \"content_filter\".", sep = ""))
        }
        self$`finish_reason` <- this_object$`finish_reason`
      }
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
      if (!is.null(this_object$`message`)) {
        `message_object` <- ChatCompletionResponseMessage$new()
        `message_object`$fromJSON(jsonlite::toJSON(this_object$`message`, auto_unbox = TRUE, digits = NA))
        self$`message` <- `message_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateChatCompletionFunctionResponseChoicesInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionFunctionResponseChoicesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionFunctionResponseChoicesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`finish_reason`) && !(this_object$`finish_reason` %in% c("stop", "length", "function_call", "content_filter"))) {
        stop(paste("Error! \"", this_object$`finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\", \"function_call\", \"content_filter\".", sep = ""))
      }
      self$`finish_reason` <- this_object$`finish_reason`
      self$`index` <- this_object$`index`
      self$`message` <- ChatCompletionResponseMessage$new()$fromJSON(jsonlite::toJSON(this_object$`message`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateChatCompletionFunctionResponseChoicesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `finish_reason`
      if (!is.null(input_json$`finish_reason`)) {
        if (!(is.character(input_json$`finish_reason`) && length(input_json$`finish_reason`) == 1)) {
          stop(paste("Error! Invalid data for `finish_reason`. Must be a string:", input_json$`finish_reason`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionFunctionResponseChoicesInner: the required field `finish_reason` is missing."))
      }
      # check the required field `index`
      if (!is.null(input_json$`index`)) {
        if (!(is.numeric(input_json$`index`) && length(input_json$`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", input_json$`index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionFunctionResponseChoicesInner: the required field `index` is missing."))
      }
      # check the required field `message`
      if (!is.null(input_json$`message`)) {
        stopifnot(R6::is.R6(input_json$`message`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionFunctionResponseChoicesInner: the required field `message` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateChatCompletionFunctionResponseChoicesInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `finish_reason` is null
      if (is.null(self$`finish_reason`)) {
        return(FALSE)
      }

      # check if the required `index` is null
      if (is.null(self$`index`)) {
        return(FALSE)
      }

      # check if the required `message` is null
      if (is.null(self$`message`)) {
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
      # check if the required `finish_reason` is null
      if (is.null(self$`finish_reason`)) {
        invalid_fields["finish_reason"] <- "Non-nullable required field `finish_reason` cannot be null."
      }

      # check if the required `index` is null
      if (is.null(self$`index`)) {
        invalid_fields["index"] <- "Non-nullable required field `index` cannot be null."
      }

      # check if the required `message` is null
      if (is.null(self$`message`)) {
        invalid_fields["message"] <- "Non-nullable required field `message` cannot be null."
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
# CreateChatCompletionFunctionResponseChoicesInner$unlock()
#
## Below is an example to define the print function
# CreateChatCompletionFunctionResponseChoicesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateChatCompletionFunctionResponseChoicesInner$lock()

