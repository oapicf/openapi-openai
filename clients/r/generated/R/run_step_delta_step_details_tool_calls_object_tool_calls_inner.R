#' @docType class
#' @title RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
#'
#' @description RunStepDeltaStepDetailsToolCallsObjectToolCallsInner Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDeltaStepDetailsToolCallsObjectToolCallsInner <- R6::R6Class(
  "RunStepDeltaStepDetailsToolCallsObjectToolCallsInner",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("RunStepDeltaStepDetailsToolCallsCodeObject", "RunStepDeltaStepDetailsToolCallsFunctionObject", "RunStepDeltaStepDetailsToolCallsRetrievalObject"),

    #' @description
    #' Initialize a new RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "RunStepDeltaStepDetailsToolCallsCodeObject", "RunStepDeltaStepDetailsToolCallsFunctionObject", "RunStepDeltaStepDetailsToolCallsRetrievalObject"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStepDeltaStepDetailsToolCallsCodeObject") {
        self$actual_instance <- instance
        self$actual_type <- "RunStepDeltaStepDetailsToolCallsCodeObject"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStepDeltaStepDetailsToolCallsFunctionObject") {
        self$actual_instance <- instance
        self$actual_type <- "RunStepDeltaStepDetailsToolCallsFunctionObject"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStepDeltaStepDetailsToolCallsRetrievalObject") {
        self$actual_instance <- instance
        self$actual_type <- "RunStepDeltaStepDetailsToolCallsRetrievalObject"
      } else {
        stop(paste("Failed to initialize RunStepDeltaStepDetailsToolCallsObjectToolCallsInner with oneOf schemas RunStepDeltaStepDetailsToolCallsCodeObject, RunStepDeltaStepDetailsToolCallsFunctionObject, RunStepDeltaStepDetailsToolCallsRetrievalObject. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `RunStepDeltaStepDetailsToolCallsCodeObject_result` <- tryCatch({
          `RunStepDeltaStepDetailsToolCallsCodeObject`$public_methods$validateJSON(input)
          `RunStepDeltaStepDetailsToolCallsCodeObject_instance` <- `RunStepDeltaStepDetailsToolCallsCodeObject`$new()
          instance <- `RunStepDeltaStepDetailsToolCallsCodeObject_instance`$fromJSON(input)
          instance_type <- "RunStepDeltaStepDetailsToolCallsCodeObject"
          matched_schemas <- append(matched_schemas, "RunStepDeltaStepDetailsToolCallsCodeObject")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStepDeltaStepDetailsToolCallsCodeObject_result`["error"])) {
        error_messages <- append(error_messages, `RunStepDeltaStepDetailsToolCallsCodeObject_result`["message"])
      }

      `RunStepDeltaStepDetailsToolCallsRetrievalObject_result` <- tryCatch({
          `RunStepDeltaStepDetailsToolCallsRetrievalObject`$public_methods$validateJSON(input)
          `RunStepDeltaStepDetailsToolCallsRetrievalObject_instance` <- `RunStepDeltaStepDetailsToolCallsRetrievalObject`$new()
          instance <- `RunStepDeltaStepDetailsToolCallsRetrievalObject_instance`$fromJSON(input)
          instance_type <- "RunStepDeltaStepDetailsToolCallsRetrievalObject"
          matched_schemas <- append(matched_schemas, "RunStepDeltaStepDetailsToolCallsRetrievalObject")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStepDeltaStepDetailsToolCallsRetrievalObject_result`["error"])) {
        error_messages <- append(error_messages, `RunStepDeltaStepDetailsToolCallsRetrievalObject_result`["message"])
      }

      `RunStepDeltaStepDetailsToolCallsFunctionObject_result` <- tryCatch({
          `RunStepDeltaStepDetailsToolCallsFunctionObject`$public_methods$validateJSON(input)
          `RunStepDeltaStepDetailsToolCallsFunctionObject_instance` <- `RunStepDeltaStepDetailsToolCallsFunctionObject`$new()
          instance <- `RunStepDeltaStepDetailsToolCallsFunctionObject_instance`$fromJSON(input)
          instance_type <- "RunStepDeltaStepDetailsToolCallsFunctionObject"
          matched_schemas <- append(matched_schemas, "RunStepDeltaStepDetailsToolCallsFunctionObject")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStepDeltaStepDetailsToolCallsFunctionObject_result`["error"])) {
        error_messages <- append(error_messages, `RunStepDeltaStepDetailsToolCallsFunctionObject_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into RunStepDeltaStepDetailsToolCallsObjectToolCallsInner with oneOf schemas RunStepDeltaStepDetailsToolCallsCodeObject, RunStepDeltaStepDetailsToolCallsFunctionObject, RunStepDeltaStepDetailsToolCallsRetrievalObject. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into RunStepDeltaStepDetailsToolCallsObjectToolCallsInner with oneOf schemas RunStepDeltaStepDetailsToolCallsCodeObject, RunStepDeltaStepDetailsToolCallsFunctionObject, RunStepDeltaStepDetailsToolCallsRetrievalObject. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize RunStepDeltaStepDetailsToolCallsObjectToolCallsInner to JSON string.
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return JSON string representation of the RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
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
    #' Convert RunStepDeltaStepDetailsToolCallsObjectToolCallsInner to a base R type
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
    #' Validate the input JSON with respect to RunStepDeltaStepDetailsToolCallsObjectToolCallsInner and
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
#RunStepDeltaStepDetailsToolCallsObjectToolCallsInner$unlock()
#
## Below is an example to define the print function
#RunStepDeltaStepDetailsToolCallsObjectToolCallsInner$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#RunStepDeltaStepDetailsToolCallsObjectToolCallsInner$lock()

