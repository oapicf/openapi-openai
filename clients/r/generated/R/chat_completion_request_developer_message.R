#' Create a new ChatCompletionRequestDeveloperMessage
#'
#' @description
#' Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 
#'
#' @docType class
#' @title ChatCompletionRequestDeveloperMessage
#' @description ChatCompletionRequestDeveloperMessage Class
#' @format An \code{R6Class} generator object
#' @field content  \link{ChatCompletionRequestDeveloperMessageContent}
#' @field role The role of the messages author, in this case `developer`. character
#' @field name An optional name for the participant. Provides the model information to differentiate between participants of the same role. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionRequestDeveloperMessage <- R6::R6Class(
  "ChatCompletionRequestDeveloperMessage",
  public = list(
    `content` = NULL,
    `role` = NULL,
    `name` = NULL,

    #' @description
    #' Initialize a new ChatCompletionRequestDeveloperMessage class.
    #'
    #' @param content content
    #' @param role The role of the messages author, in this case `developer`.
    #' @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
    #' @param ... Other optional arguments.
    initialize = function(`content`, `role`, `name` = NULL, ...) {
      if (!missing(`content`)) {
        stopifnot(R6::is.R6(`content`))
        self$`content` <- `content`
      }
      if (!missing(`role`)) {
        if (!(`role` %in% c("developer"))) {
          stop(paste("Error! \"", `role`, "\" cannot be assigned to `role`. Must be \"developer\".", sep = ""))
        }
        if (!(is.character(`role`) && length(`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", `role`))
        }
        self$`role` <- `role`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
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
    #' @return ChatCompletionRequestDeveloperMessage as a base R list.
    #' @examples
    #' # convert array of ChatCompletionRequestDeveloperMessage (x) to a data frame
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
    #' Convert ChatCompletionRequestDeveloperMessage to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ChatCompletionRequestDeveloperMessageObject <- list()
      if (!is.null(self$`content`)) {
        ChatCompletionRequestDeveloperMessageObject[["content"]] <-
          self$`content`$toSimpleType()
      }
      if (!is.null(self$`role`)) {
        ChatCompletionRequestDeveloperMessageObject[["role"]] <-
          self$`role`
      }
      if (!is.null(self$`name`)) {
        ChatCompletionRequestDeveloperMessageObject[["name"]] <-
          self$`name`
      }
      return(ChatCompletionRequestDeveloperMessageObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestDeveloperMessage
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestDeveloperMessage
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`content`)) {
        `content_object` <- ChatCompletionRequestDeveloperMessageContent$new()
        `content_object`$fromJSON(jsonlite::toJSON(this_object$`content`, auto_unbox = TRUE, digits = NA))
        self$`content` <- `content_object`
      }
      if (!is.null(this_object$`role`)) {
        if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("developer"))) {
          stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"developer\".", sep = ""))
        }
        self$`role` <- this_object$`role`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ChatCompletionRequestDeveloperMessage in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestDeveloperMessage
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestDeveloperMessage
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`content` <- ChatCompletionRequestDeveloperMessageContent$new()$fromJSON(jsonlite::toJSON(this_object$`content`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("developer"))) {
        stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"developer\".", sep = ""))
      }
      self$`role` <- this_object$`role`
      self$`name` <- this_object$`name`
      self
    },

    #' @description
    #' Validate JSON input with respect to ChatCompletionRequestDeveloperMessage and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `content`
      if (!is.null(input_json$`content`)) {
        stopifnot(R6::is.R6(input_json$`content`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestDeveloperMessage: the required field `content` is missing."))
      }
      # check the required field `role`
      if (!is.null(input_json$`role`)) {
        if (!(is.character(input_json$`role`) && length(input_json$`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", input_json$`role`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestDeveloperMessage: the required field `role` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionRequestDeveloperMessage
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `content` is null
      if (is.null(self$`content`)) {
        return(FALSE)
      }

      # check if the required `role` is null
      if (is.null(self$`role`)) {
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
      # check if the required `content` is null
      if (is.null(self$`content`)) {
        invalid_fields["content"] <- "Non-nullable required field `content` cannot be null."
      }

      # check if the required `role` is null
      if (is.null(self$`role`)) {
        invalid_fields["role"] <- "Non-nullable required field `role` cannot be null."
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
# ChatCompletionRequestDeveloperMessage$unlock()
#
## Below is an example to define the print function
# ChatCompletionRequestDeveloperMessage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionRequestDeveloperMessage$lock()

