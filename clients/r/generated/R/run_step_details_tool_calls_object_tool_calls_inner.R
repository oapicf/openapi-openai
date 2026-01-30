#' @docType class
#' @title RunStepDetailsToolCallsObjectToolCallsInner
#'
#' @description RunStepDetailsToolCallsObjectToolCallsInner Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDetailsToolCallsObjectToolCallsInner <- R6::R6Class(
  "RunStepDetailsToolCallsObjectToolCallsInner",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("RunStepDetailsToolCallsCodeObject", "RunStepDetailsToolCallsFileSearchObject", "RunStepDetailsToolCallsFunctionObject"),

    #' @description
    #' Initialize a new RunStepDetailsToolCallsObjectToolCallsInner.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "RunStepDetailsToolCallsCodeObject", "RunStepDetailsToolCallsFileSearchObject", "RunStepDetailsToolCallsFunctionObject"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStepDetailsToolCallsCodeObject") {
        self$actual_instance <- instance
        self$actual_type <- "RunStepDetailsToolCallsCodeObject"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStepDetailsToolCallsFileSearchObject") {
        self$actual_instance <- instance
        self$actual_type <- "RunStepDetailsToolCallsFileSearchObject"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStepDetailsToolCallsFunctionObject") {
        self$actual_instance <- instance
        self$actual_type <- "RunStepDetailsToolCallsFunctionObject"
      } else {
        stop(paste("Failed to initialize RunStepDetailsToolCallsObjectToolCallsInner with oneOf schemas RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFileSearchObject, RunStepDetailsToolCallsFunctionObject. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsObjectToolCallsInner.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of RunStepDetailsToolCallsObjectToolCallsInner.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsObjectToolCallsInner.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of RunStepDetailsToolCallsObjectToolCallsInner.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `RunStepDetailsToolCallsCodeObject_result` <- tryCatch({
          `RunStepDetailsToolCallsCodeObject`$public_methods$validateJSON(input)
          `RunStepDetailsToolCallsCodeObject_instance` <- `RunStepDetailsToolCallsCodeObject`$new()
          instance <- `RunStepDetailsToolCallsCodeObject_instance`$fromJSON(input)
          instance_type <- "RunStepDetailsToolCallsCodeObject"
          matched_schemas <- append(matched_schemas, "RunStepDetailsToolCallsCodeObject")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStepDetailsToolCallsCodeObject_result`["error"])) {
        error_messages <- append(error_messages, `RunStepDetailsToolCallsCodeObject_result`["message"])
      }

      `RunStepDetailsToolCallsFileSearchObject_result` <- tryCatch({
          `RunStepDetailsToolCallsFileSearchObject`$public_methods$validateJSON(input)
          `RunStepDetailsToolCallsFileSearchObject_instance` <- `RunStepDetailsToolCallsFileSearchObject`$new()
          instance <- `RunStepDetailsToolCallsFileSearchObject_instance`$fromJSON(input)
          instance_type <- "RunStepDetailsToolCallsFileSearchObject"
          matched_schemas <- append(matched_schemas, "RunStepDetailsToolCallsFileSearchObject")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStepDetailsToolCallsFileSearchObject_result`["error"])) {
        error_messages <- append(error_messages, `RunStepDetailsToolCallsFileSearchObject_result`["message"])
      }

      `RunStepDetailsToolCallsFunctionObject_result` <- tryCatch({
          `RunStepDetailsToolCallsFunctionObject`$public_methods$validateJSON(input)
          `RunStepDetailsToolCallsFunctionObject_instance` <- `RunStepDetailsToolCallsFunctionObject`$new()
          instance <- `RunStepDetailsToolCallsFunctionObject_instance`$fromJSON(input)
          instance_type <- "RunStepDetailsToolCallsFunctionObject"
          matched_schemas <- append(matched_schemas, "RunStepDetailsToolCallsFunctionObject")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStepDetailsToolCallsFunctionObject_result`["error"])) {
        error_messages <- append(error_messages, `RunStepDetailsToolCallsFunctionObject_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into RunStepDetailsToolCallsObjectToolCallsInner with oneOf schemas RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFileSearchObject, RunStepDetailsToolCallsFunctionObject. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into RunStepDetailsToolCallsObjectToolCallsInner with oneOf schemas RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFileSearchObject, RunStepDetailsToolCallsFunctionObject. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize RunStepDetailsToolCallsObjectToolCallsInner to JSON string.
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return JSON string representation of the RunStepDetailsToolCallsObjectToolCallsInner.
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
    #' Convert RunStepDetailsToolCallsObjectToolCallsInner to a base R type
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
    #' Validate the input JSON with respect to RunStepDetailsToolCallsObjectToolCallsInner and
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
#RunStepDetailsToolCallsObjectToolCallsInner$unlock()
#
## Below is an example to define the print function
#RunStepDetailsToolCallsObjectToolCallsInner$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#RunStepDetailsToolCallsObjectToolCallsInner$lock()

