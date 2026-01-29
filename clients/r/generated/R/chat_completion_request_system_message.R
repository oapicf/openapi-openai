#' Create a new ChatCompletionRequestSystemMessage
#'
#' @description
#' ChatCompletionRequestSystemMessage Class
#'
#' @docType class
#' @title ChatCompletionRequestSystemMessage
#' @description ChatCompletionRequestSystemMessage Class
#' @format An \code{R6Class} generator object
#' @field content The contents of the system message. character
#' @field role The role of the messages author, in this case `system`. character
#' @field name An optional name for the participant. Provides the model information to differentiate between participants of the same role. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionRequestSystemMessage <- R6::R6Class(
  "ChatCompletionRequestSystemMessage",
  public = list(
    `content` = NULL,
    `role` = NULL,
    `name` = NULL,

    #' @description
    #' Initialize a new ChatCompletionRequestSystemMessage class.
    #'
    #' @param content The contents of the system message.
    #' @param role The role of the messages author, in this case `system`.
    #' @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
    #' @param ... Other optional arguments.
    initialize = function(`content`, `role`, `name` = NULL, ...) {
      if (!missing(`content`)) {
        if (!(is.character(`content`) && length(`content`) == 1)) {
          stop(paste("Error! Invalid data for `content`. Must be a string:", `content`))
        }
        self$`content` <- `content`
      }
      if (!missing(`role`)) {
        if (!(`role` %in% c("system"))) {
          stop(paste("Error! \"", `role`, "\" cannot be assigned to `role`. Must be \"system\".", sep = ""))
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
    #' @return ChatCompletionRequestSystemMessage as a base R list.
    #' @examples
    #' # convert array of ChatCompletionRequestSystemMessage (x) to a data frame
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
    #' Convert ChatCompletionRequestSystemMessage to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ChatCompletionRequestSystemMessageObject <- list()
      if (!is.null(self$`content`)) {
        ChatCompletionRequestSystemMessageObject[["content"]] <-
          self$`content`
      }
      if (!is.null(self$`role`)) {
        ChatCompletionRequestSystemMessageObject[["role"]] <-
          self$`role`
      }
      if (!is.null(self$`name`)) {
        ChatCompletionRequestSystemMessageObject[["name"]] <-
          self$`name`
      }
      return(ChatCompletionRequestSystemMessageObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestSystemMessage
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestSystemMessage
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`content`)) {
        self$`content` <- this_object$`content`
      }
      if (!is.null(this_object$`role`)) {
        if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("system"))) {
          stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"system\".", sep = ""))
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
    #' @return ChatCompletionRequestSystemMessage in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestSystemMessage
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestSystemMessage
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`content` <- this_object$`content`
      if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("system"))) {
        stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"system\".", sep = ""))
      }
      self$`role` <- this_object$`role`
      self$`name` <- this_object$`name`
      self
    },

    #' @description
    #' Validate JSON input with respect to ChatCompletionRequestSystemMessage and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `content`
      if (!is.null(input_json$`content`)) {
        if (!(is.character(input_json$`content`) && length(input_json$`content`) == 1)) {
          stop(paste("Error! Invalid data for `content`. Must be a string:", input_json$`content`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestSystemMessage: the required field `content` is missing."))
      }
      # check the required field `role`
      if (!is.null(input_json$`role`)) {
        if (!(is.character(input_json$`role`) && length(input_json$`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", input_json$`role`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestSystemMessage: the required field `role` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionRequestSystemMessage
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
# ChatCompletionRequestSystemMessage$unlock()
#
## Below is an example to define the print function
# ChatCompletionRequestSystemMessage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionRequestSystemMessage$lock()

