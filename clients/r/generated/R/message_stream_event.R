#' @docType class
#' @title MessageStreamEvent
#'
#' @description MessageStreamEvent Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageStreamEvent <- R6::R6Class(
  "MessageStreamEvent",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("MessageStreamEventOneOf", "MessageStreamEventOneOf1", "MessageStreamEventOneOf2", "MessageStreamEventOneOf3", "MessageStreamEventOneOf4"),

    #' @description
    #' Initialize a new MessageStreamEvent.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "MessageStreamEventOneOf", "MessageStreamEventOneOf1", "MessageStreamEventOneOf2", "MessageStreamEventOneOf3", "MessageStreamEventOneOf4"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "MessageStreamEventOneOf") {
        self$actual_instance <- instance
        self$actual_type <- "MessageStreamEventOneOf"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "MessageStreamEventOneOf1") {
        self$actual_instance <- instance
        self$actual_type <- "MessageStreamEventOneOf1"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "MessageStreamEventOneOf2") {
        self$actual_instance <- instance
        self$actual_type <- "MessageStreamEventOneOf2"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "MessageStreamEventOneOf3") {
        self$actual_instance <- instance
        self$actual_type <- "MessageStreamEventOneOf3"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "MessageStreamEventOneOf4") {
        self$actual_instance <- instance
        self$actual_type <- "MessageStreamEventOneOf4"
      } else {
        stop(paste("Failed to initialize MessageStreamEvent with oneOf schemas MessageStreamEventOneOf, MessageStreamEventOneOf1, MessageStreamEventOneOf2, MessageStreamEventOneOf3, MessageStreamEventOneOf4. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageStreamEvent.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of MessageStreamEvent.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageStreamEvent.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of MessageStreamEvent.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `MessageStreamEventOneOf_result` <- tryCatch({
          `MessageStreamEventOneOf`$public_methods$validateJSON(input)
          `MessageStreamEventOneOf_instance` <- `MessageStreamEventOneOf`$new()
          instance <- `MessageStreamEventOneOf_instance`$fromJSON(input)
          instance_type <- "MessageStreamEventOneOf"
          matched_schemas <- append(matched_schemas, "MessageStreamEventOneOf")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`MessageStreamEventOneOf_result`["error"])) {
        error_messages <- append(error_messages, `MessageStreamEventOneOf_result`["message"])
      }

      `MessageStreamEventOneOf1_result` <- tryCatch({
          `MessageStreamEventOneOf1`$public_methods$validateJSON(input)
          `MessageStreamEventOneOf1_instance` <- `MessageStreamEventOneOf1`$new()
          instance <- `MessageStreamEventOneOf1_instance`$fromJSON(input)
          instance_type <- "MessageStreamEventOneOf1"
          matched_schemas <- append(matched_schemas, "MessageStreamEventOneOf1")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`MessageStreamEventOneOf1_result`["error"])) {
        error_messages <- append(error_messages, `MessageStreamEventOneOf1_result`["message"])
      }

      `MessageStreamEventOneOf2_result` <- tryCatch({
          `MessageStreamEventOneOf2`$public_methods$validateJSON(input)
          `MessageStreamEventOneOf2_instance` <- `MessageStreamEventOneOf2`$new()
          instance <- `MessageStreamEventOneOf2_instance`$fromJSON(input)
          instance_type <- "MessageStreamEventOneOf2"
          matched_schemas <- append(matched_schemas, "MessageStreamEventOneOf2")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`MessageStreamEventOneOf2_result`["error"])) {
        error_messages <- append(error_messages, `MessageStreamEventOneOf2_result`["message"])
      }

      `MessageStreamEventOneOf3_result` <- tryCatch({
          `MessageStreamEventOneOf3`$public_methods$validateJSON(input)
          `MessageStreamEventOneOf3_instance` <- `MessageStreamEventOneOf3`$new()
          instance <- `MessageStreamEventOneOf3_instance`$fromJSON(input)
          instance_type <- "MessageStreamEventOneOf3"
          matched_schemas <- append(matched_schemas, "MessageStreamEventOneOf3")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`MessageStreamEventOneOf3_result`["error"])) {
        error_messages <- append(error_messages, `MessageStreamEventOneOf3_result`["message"])
      }

      `MessageStreamEventOneOf4_result` <- tryCatch({
          `MessageStreamEventOneOf4`$public_methods$validateJSON(input)
          `MessageStreamEventOneOf4_instance` <- `MessageStreamEventOneOf4`$new()
          instance <- `MessageStreamEventOneOf4_instance`$fromJSON(input)
          instance_type <- "MessageStreamEventOneOf4"
          matched_schemas <- append(matched_schemas, "MessageStreamEventOneOf4")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`MessageStreamEventOneOf4_result`["error"])) {
        error_messages <- append(error_messages, `MessageStreamEventOneOf4_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into MessageStreamEvent with oneOf schemas MessageStreamEventOneOf, MessageStreamEventOneOf1, MessageStreamEventOneOf2, MessageStreamEventOneOf3, MessageStreamEventOneOf4. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into MessageStreamEvent with oneOf schemas MessageStreamEventOneOf, MessageStreamEventOneOf1, MessageStreamEventOneOf2, MessageStreamEventOneOf3, MessageStreamEventOneOf4. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize MessageStreamEvent to JSON string.
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return JSON string representation of the MessageStreamEvent.
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
    #' Convert MessageStreamEvent to a base R type
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
    #' Validate the input JSON with respect to MessageStreamEvent and
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
#MessageStreamEvent$unlock()
#
## Below is an example to define the print function
#MessageStreamEvent$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#MessageStreamEvent$lock()

