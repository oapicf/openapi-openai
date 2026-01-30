#' @docType class
#' @title MessageObjectContentInner
#'
#' @description MessageObjectContentInner Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageObjectContentInner <- R6::R6Class(
  "MessageObjectContentInner",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("MessageContentImageFileObject", "MessageContentImageUrlObject", "MessageContentRefusalObject", "MessageContentTextObject"),

    #' @description
    #' Initialize a new MessageObjectContentInner.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "MessageContentImageFileObject", "MessageContentImageUrlObject", "MessageContentRefusalObject", "MessageContentTextObject"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "MessageContentImageFileObject") {
        self$actual_instance <- instance
        self$actual_type <- "MessageContentImageFileObject"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "MessageContentImageUrlObject") {
        self$actual_instance <- instance
        self$actual_type <- "MessageContentImageUrlObject"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "MessageContentRefusalObject") {
        self$actual_instance <- instance
        self$actual_type <- "MessageContentRefusalObject"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "MessageContentTextObject") {
        self$actual_instance <- instance
        self$actual_type <- "MessageContentTextObject"
      } else {
        stop(paste("Failed to initialize MessageObjectContentInner with oneOf schemas MessageContentImageFileObject, MessageContentImageUrlObject, MessageContentRefusalObject, MessageContentTextObject. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageObjectContentInner.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of MessageObjectContentInner.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageObjectContentInner.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of MessageObjectContentInner.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `MessageContentImageFileObject_result` <- tryCatch({
          `MessageContentImageFileObject`$public_methods$validateJSON(input)
          `MessageContentImageFileObject_instance` <- `MessageContentImageFileObject`$new()
          instance <- `MessageContentImageFileObject_instance`$fromJSON(input)
          instance_type <- "MessageContentImageFileObject"
          matched_schemas <- append(matched_schemas, "MessageContentImageFileObject")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`MessageContentImageFileObject_result`["error"])) {
        error_messages <- append(error_messages, `MessageContentImageFileObject_result`["message"])
      }

      `MessageContentImageUrlObject_result` <- tryCatch({
          `MessageContentImageUrlObject`$public_methods$validateJSON(input)
          `MessageContentImageUrlObject_instance` <- `MessageContentImageUrlObject`$new()
          instance <- `MessageContentImageUrlObject_instance`$fromJSON(input)
          instance_type <- "MessageContentImageUrlObject"
          matched_schemas <- append(matched_schemas, "MessageContentImageUrlObject")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`MessageContentImageUrlObject_result`["error"])) {
        error_messages <- append(error_messages, `MessageContentImageUrlObject_result`["message"])
      }

      `MessageContentTextObject_result` <- tryCatch({
          `MessageContentTextObject`$public_methods$validateJSON(input)
          `MessageContentTextObject_instance` <- `MessageContentTextObject`$new()
          instance <- `MessageContentTextObject_instance`$fromJSON(input)
          instance_type <- "MessageContentTextObject"
          matched_schemas <- append(matched_schemas, "MessageContentTextObject")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`MessageContentTextObject_result`["error"])) {
        error_messages <- append(error_messages, `MessageContentTextObject_result`["message"])
      }

      `MessageContentRefusalObject_result` <- tryCatch({
          `MessageContentRefusalObject`$public_methods$validateJSON(input)
          `MessageContentRefusalObject_instance` <- `MessageContentRefusalObject`$new()
          instance <- `MessageContentRefusalObject_instance`$fromJSON(input)
          instance_type <- "MessageContentRefusalObject"
          matched_schemas <- append(matched_schemas, "MessageContentRefusalObject")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`MessageContentRefusalObject_result`["error"])) {
        error_messages <- append(error_messages, `MessageContentRefusalObject_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into MessageObjectContentInner with oneOf schemas MessageContentImageFileObject, MessageContentImageUrlObject, MessageContentRefusalObject, MessageContentTextObject. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into MessageObjectContentInner with oneOf schemas MessageContentImageFileObject, MessageContentImageUrlObject, MessageContentRefusalObject, MessageContentTextObject. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize MessageObjectContentInner to JSON string.
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return JSON string representation of the MessageObjectContentInner.
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
    #' Convert MessageObjectContentInner to a base R type
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
    #' Validate the input JSON with respect to MessageObjectContentInner and
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
#MessageObjectContentInner$unlock()
#
## Below is an example to define the print function
#MessageObjectContentInner$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#MessageObjectContentInner$lock()

