#' @docType class
#' @title ChatCompletionRequestMessage
#'
#' @description ChatCompletionRequestMessage Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionRequestMessage <- R6::R6Class(
  "ChatCompletionRequestMessage",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("ChatCompletionRequestAssistantMessage", "ChatCompletionRequestDeveloperMessage", "ChatCompletionRequestFunctionMessage", "ChatCompletionRequestSystemMessage", "ChatCompletionRequestToolMessage", "ChatCompletionRequestUserMessage"),

    #' @description
    #' Initialize a new ChatCompletionRequestMessage.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "ChatCompletionRequestAssistantMessage", "ChatCompletionRequestDeveloperMessage", "ChatCompletionRequestFunctionMessage", "ChatCompletionRequestSystemMessage", "ChatCompletionRequestToolMessage", "ChatCompletionRequestUserMessage"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ChatCompletionRequestAssistantMessage") {
        self$actual_instance <- instance
        self$actual_type <- "ChatCompletionRequestAssistantMessage"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ChatCompletionRequestDeveloperMessage") {
        self$actual_instance <- instance
        self$actual_type <- "ChatCompletionRequestDeveloperMessage"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ChatCompletionRequestFunctionMessage") {
        self$actual_instance <- instance
        self$actual_type <- "ChatCompletionRequestFunctionMessage"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ChatCompletionRequestSystemMessage") {
        self$actual_instance <- instance
        self$actual_type <- "ChatCompletionRequestSystemMessage"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ChatCompletionRequestToolMessage") {
        self$actual_instance <- instance
        self$actual_type <- "ChatCompletionRequestToolMessage"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ChatCompletionRequestUserMessage") {
        self$actual_instance <- instance
        self$actual_type <- "ChatCompletionRequestUserMessage"
      } else {
        stop(paste("Failed to initialize ChatCompletionRequestMessage with oneOf schemas ChatCompletionRequestAssistantMessage, ChatCompletionRequestDeveloperMessage, ChatCompletionRequestFunctionMessage, ChatCompletionRequestSystemMessage, ChatCompletionRequestToolMessage, ChatCompletionRequestUserMessage. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessage.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of ChatCompletionRequestMessage.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessage.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of ChatCompletionRequestMessage.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `ChatCompletionRequestDeveloperMessage_result` <- tryCatch({
          `ChatCompletionRequestDeveloperMessage`$public_methods$validateJSON(input)
          `ChatCompletionRequestDeveloperMessage_instance` <- `ChatCompletionRequestDeveloperMessage`$new()
          instance <- `ChatCompletionRequestDeveloperMessage_instance`$fromJSON(input)
          instance_type <- "ChatCompletionRequestDeveloperMessage"
          matched_schemas <- append(matched_schemas, "ChatCompletionRequestDeveloperMessage")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ChatCompletionRequestDeveloperMessage_result`["error"])) {
        error_messages <- append(error_messages, `ChatCompletionRequestDeveloperMessage_result`["message"])
      }

      `ChatCompletionRequestSystemMessage_result` <- tryCatch({
          `ChatCompletionRequestSystemMessage`$public_methods$validateJSON(input)
          `ChatCompletionRequestSystemMessage_instance` <- `ChatCompletionRequestSystemMessage`$new()
          instance <- `ChatCompletionRequestSystemMessage_instance`$fromJSON(input)
          instance_type <- "ChatCompletionRequestSystemMessage"
          matched_schemas <- append(matched_schemas, "ChatCompletionRequestSystemMessage")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ChatCompletionRequestSystemMessage_result`["error"])) {
        error_messages <- append(error_messages, `ChatCompletionRequestSystemMessage_result`["message"])
      }

      `ChatCompletionRequestUserMessage_result` <- tryCatch({
          `ChatCompletionRequestUserMessage`$public_methods$validateJSON(input)
          `ChatCompletionRequestUserMessage_instance` <- `ChatCompletionRequestUserMessage`$new()
          instance <- `ChatCompletionRequestUserMessage_instance`$fromJSON(input)
          instance_type <- "ChatCompletionRequestUserMessage"
          matched_schemas <- append(matched_schemas, "ChatCompletionRequestUserMessage")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ChatCompletionRequestUserMessage_result`["error"])) {
        error_messages <- append(error_messages, `ChatCompletionRequestUserMessage_result`["message"])
      }

      `ChatCompletionRequestAssistantMessage_result` <- tryCatch({
          `ChatCompletionRequestAssistantMessage`$public_methods$validateJSON(input)
          `ChatCompletionRequestAssistantMessage_instance` <- `ChatCompletionRequestAssistantMessage`$new()
          instance <- `ChatCompletionRequestAssistantMessage_instance`$fromJSON(input)
          instance_type <- "ChatCompletionRequestAssistantMessage"
          matched_schemas <- append(matched_schemas, "ChatCompletionRequestAssistantMessage")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ChatCompletionRequestAssistantMessage_result`["error"])) {
        error_messages <- append(error_messages, `ChatCompletionRequestAssistantMessage_result`["message"])
      }

      `ChatCompletionRequestToolMessage_result` <- tryCatch({
          `ChatCompletionRequestToolMessage`$public_methods$validateJSON(input)
          `ChatCompletionRequestToolMessage_instance` <- `ChatCompletionRequestToolMessage`$new()
          instance <- `ChatCompletionRequestToolMessage_instance`$fromJSON(input)
          instance_type <- "ChatCompletionRequestToolMessage"
          matched_schemas <- append(matched_schemas, "ChatCompletionRequestToolMessage")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ChatCompletionRequestToolMessage_result`["error"])) {
        error_messages <- append(error_messages, `ChatCompletionRequestToolMessage_result`["message"])
      }

      `ChatCompletionRequestFunctionMessage_result` <- tryCatch({
          `ChatCompletionRequestFunctionMessage`$public_methods$validateJSON(input)
          `ChatCompletionRequestFunctionMessage_instance` <- `ChatCompletionRequestFunctionMessage`$new()
          instance <- `ChatCompletionRequestFunctionMessage_instance`$fromJSON(input)
          instance_type <- "ChatCompletionRequestFunctionMessage"
          matched_schemas <- append(matched_schemas, "ChatCompletionRequestFunctionMessage")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ChatCompletionRequestFunctionMessage_result`["error"])) {
        error_messages <- append(error_messages, `ChatCompletionRequestFunctionMessage_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into ChatCompletionRequestMessage with oneOf schemas ChatCompletionRequestAssistantMessage, ChatCompletionRequestDeveloperMessage, ChatCompletionRequestFunctionMessage, ChatCompletionRequestSystemMessage, ChatCompletionRequestToolMessage, ChatCompletionRequestUserMessage. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into ChatCompletionRequestMessage with oneOf schemas ChatCompletionRequestAssistantMessage, ChatCompletionRequestDeveloperMessage, ChatCompletionRequestFunctionMessage, ChatCompletionRequestSystemMessage, ChatCompletionRequestToolMessage, ChatCompletionRequestUserMessage. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize ChatCompletionRequestMessage to JSON string.
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return JSON string representation of the ChatCompletionRequestMessage.
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      if (!is.null(self$actual_instance)) {
        json <- jsonlite::toJSON(simple, auto_unbox = TRUE, ...)
        return(as.character(jsonlite::minify(json)))
      } else {
        return(NULL)
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert ChatCompletionRequestMessage to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      if (!is.null(self$actual_instance)) {
        return(self$actual_instance$toSimpleType())
      } else {
        return(NULL)
      }
    },

    #' @description
    #' Validate the input JSON with respect to ChatCompletionRequestMessage and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    validateJSON = function(input) {
      # backup current values
      actual_instance_bak <- self$actual_instance
      actual_type_bak <- self$actual_type

      # if it's not valid, an error will be thrown
      self$fromJSON(input)

      # no error thrown, restore old values
      self$actual_instance <- actual_instance_bak
      self$actual_type <- actual_type_bak
    },

    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"one_of": "%s"', paste(unlist(self$one_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
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
#ChatCompletionRequestMessage$unlock()
#
## Below is an example to define the print function
#ChatCompletionRequestMessage$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#ChatCompletionRequestMessage$lock()

