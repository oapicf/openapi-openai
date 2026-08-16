//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateChatCompletionStreamResponseChoicesInner {
  /// Returns a new [CreateChatCompletionStreamResponseChoicesInner] instance.
  CreateChatCompletionStreamResponseChoicesInner({
    required this.delta,
    this.logprobs,
    required this.finishReason,
    required this.index,
  });

  ChatCompletionStreamResponseDelta delta;

  CreateChatCompletionResponseChoicesInnerLogprobs? logprobs;

  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum? finishReason;

  /// The index of the choice in the list of choices.
  int index;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateChatCompletionStreamResponseChoicesInner &&
    other.delta == delta &&
    other.logprobs == logprobs &&
    other.finishReason == finishReason &&
    other.index == index;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (delta.hashCode) +
    (logprobs == null ? 0 : logprobs!.hashCode) +
    (finishReason == null ? 0 : finishReason!.hashCode) +
    (index.hashCode);

  @override
  String toString() => 'CreateChatCompletionStreamResponseChoicesInner[delta=$delta, logprobs=$logprobs, finishReason=$finishReason, index=$index]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'delta'] = this.delta;
    if (this.logprobs != null) {
      json[r'logprobs'] = this.logprobs;
    } else {
      json[r'logprobs'] = null;
    }
    if (this.finishReason != null) {
      json[r'finish_reason'] = this.finishReason;
    } else {
      json[r'finish_reason'] = null;
    }
      json[r'index'] = this.index;
    return json;
  }

  /// Returns a new [CreateChatCompletionStreamResponseChoicesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateChatCompletionStreamResponseChoicesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateChatCompletionStreamResponseChoicesInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateChatCompletionStreamResponseChoicesInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateChatCompletionStreamResponseChoicesInner(
        delta: ChatCompletionStreamResponseDelta.fromJson(json[r'delta'])!,
        logprobs: CreateChatCompletionResponseChoicesInnerLogprobs.fromJson(json[r'logprobs']),
        finishReason: CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum.fromJson(json[r'finish_reason']),
        index: mapValueOfType<int>(json, r'index')!,
      );
    }
    return null;
  }

  static List<CreateChatCompletionStreamResponseChoicesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatCompletionStreamResponseChoicesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatCompletionStreamResponseChoicesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateChatCompletionStreamResponseChoicesInner> mapFromJson(dynamic json) {
    final map = <String, CreateChatCompletionStreamResponseChoicesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateChatCompletionStreamResponseChoicesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateChatCompletionStreamResponseChoicesInner-objects as value to a dart map
  static Map<String, List<CreateChatCompletionStreamResponseChoicesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateChatCompletionStreamResponseChoicesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateChatCompletionStreamResponseChoicesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'delta',
    'finish_reason',
    'index',
  };
}

/// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
class CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const stop = CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum._(r'stop');
  static const length = CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum._(r'length');
  static const toolCalls = CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum._(r'tool_calls');
  static const contentFilter = CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum._(r'content_filter');
  static const functionCall = CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum._(r'function_call');

  /// List of all possible values in this [enum][CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum].
  static const values = <CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum>[
    stop,
    length,
    toolCalls,
    contentFilter,
    functionCall,
  ];

  static CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum? fromJson(dynamic value) => CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnumTypeTransformer().decode(value);

  static List<CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum] to String,
/// and [decode] dynamic data back to [CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum].
class CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnumTypeTransformer {
  factory CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnumTypeTransformer() => _instance ??= const CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnumTypeTransformer._();

  const CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnumTypeTransformer._();

  String encode(CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'stop': return CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum.stop;
        case r'length': return CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum.length;
        case r'tool_calls': return CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum.toolCalls;
        case r'content_filter': return CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum.contentFilter;
        case r'function_call': return CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum.functionCall;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnumTypeTransformer] instance.
  static CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnumTypeTransformer? _instance;
}


