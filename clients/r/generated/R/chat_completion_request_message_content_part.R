#' @docType class
#' @title ChatCompletionRequestMessageContentPart
#'
#' @description ChatCompletionRequestMessageContentPart Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionRequestMessageContentPart <- R6::R6Class(
  "ChatCompletionRequestMessageContentPart",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("ChatCompletionRequestMessageContentPartImage", "ChatCompletionRequestMessageContentPartText"),

    #' @description
    #' Initialize a new ChatCompletionRequestMessageContentPart.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "ChatCompletionRequestMessageContentPartImage", "ChatCompletionRequestMessageContentPartText"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ChatCompletionRequestMessageContentPartImage") {
        self$actual_instance <- instance
        self$actual_type <- "ChatCompletionRequestMessageContentPartImage"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ChatCompletionRequestMessageContentPartText") {
        self$actual_instance <- instance
        self$actual_type <- "ChatCompletionRequestMessageContentPartText"
      } else {
        stop(paste("Failed to initialize ChatCompletionRequestMessageContentPart with oneOf schemas ChatCompletionRequestMessageContentPartImage, ChatCompletionRequestMessageContentPartText. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessageContentPart.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of ChatCompletionRequestMessageContentPart.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessageContentPart.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of ChatCompletionRequestMessageContentPart.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `ChatCompletionRequestMessageContentPartText_result` <- tryCatch({
          `ChatCompletionRequestMessageContentPartText`$public_methods$validateJSON(input)
          `ChatCompletionRequestMessageContentPartText_instance` <- `ChatCompletionRequestMessageContentPartText`$new()
          instance <- `ChatCompletionRequestMessageContentPartText_instance`$fromJSON(input)
          instance_type <- "ChatCompletionRequestMessageContentPartText"
          matched_schemas <- append(matched_schemas, "ChatCompletionRequestMessageContentPartText")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ChatCompletionRequestMessageContentPartText_result`["error"])) {
        error_messages <- append(error_messages, `ChatCompletionRequestMessageContentPartText_result`["message"])
      }

      `ChatCompletionRequestMessageContentPartImage_result` <- tryCatch({
          `ChatCompletionRequestMessageContentPartImage`$public_methods$validateJSON(input)
          `ChatCompletionRequestMessageContentPartImage_instance` <- `ChatCompletionRequestMessageContentPartImage`$new()
          instance <- `ChatCompletionRequestMessageContentPartImage_instance`$fromJSON(input)
          instance_type <- "ChatCompletionRequestMessageContentPartImage"
          matched_schemas <- append(matched_schemas, "ChatCompletionRequestMessageContentPartImage")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ChatCompletionRequestMessageContentPartImage_result`["error"])) {
        error_messages <- append(error_messages, `ChatCompletionRequestMessageContentPartImage_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into ChatCompletionRequestMessageContentPart with oneOf schemas ChatCompletionRequestMessageContentPartImage, ChatCompletionRequestMessageContentPartText. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into ChatCompletionRequestMessageContentPart with oneOf schemas ChatCompletionRequestMessageContentPartImage, ChatCompletionRequestMessageContentPartText. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize ChatCompletionRequestMessageContentPart to JSON string.
    #'
    #' @return JSON string representation of the ChatCompletionRequestMessageContentPart.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize ChatCompletionRequestMessageContentPart to JSON.
    #'
    #' @return JSON representation of the ChatCompletionRequestMessageContentPart.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to ChatCompletionRequestMessageContentPart and
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
#ChatCompletionRequestMessageContentPart$unlock()
#
## Below is an example to define the print function
#ChatCompletionRequestMessageContentPart$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#ChatCompletionRequestMessageContentPart$lock()

