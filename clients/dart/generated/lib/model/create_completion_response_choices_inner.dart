//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateCompletionResponseChoicesInner {
  /// Returns a new [CreateCompletionResponseChoicesInner] instance.
  CreateCompletionResponseChoicesInner({
    required this.finishReason,
    required this.index,
    required this.logprobs,
    required this.text,
  });

  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
  CreateCompletionResponseChoicesInnerFinishReasonEnum finishReason;

  int index;

  CreateCompletionResponseChoicesInnerLogprobs? logprobs;

  String text;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateCompletionResponseChoicesInner &&
    other.finishReason == finishReason &&
    other.index == index &&
    other.logprobs == logprobs &&
    other.text == text;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (finishReason.hashCode) +
    (index.hashCode) +
    (logprobs == null ? 0 : logprobs!.hashCode) +
    (text.hashCode);

  @override
  String toString() => 'CreateCompletionResponseChoicesInner[finishReason=$finishReason, index=$index, logprobs=$logprobs, text=$text]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'finish_reason'] = this.finishReason;
      json[r'index'] = this.index;
    if (this.logprobs != null) {
      json[r'logprobs'] = this.logprobs;
    } else {
      json[r'logprobs'] = null;
    }
      json[r'text'] = this.text;
    return json;
  }

  /// Returns a new [CreateCompletionResponseChoicesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateCompletionResponseChoicesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateCompletionResponseChoicesInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateCompletionResponseChoicesInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateCompletionResponseChoicesInner(
        finishReason: CreateCompletionResponseChoicesInnerFinishReasonEnum.fromJson(json[r'finish_reason'])!,
        index: mapValueOfType<int>(json, r'index')!,
        logprobs: CreateCompletionResponseChoicesInnerLogprobs.fromJson(json[r'logprobs']),
        text: mapValueOfType<String>(json, r'text')!,
      );
    }
    return null;
  }

  static List<CreateCompletionResponseChoicesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateCompletionResponseChoicesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateCompletionResponseChoicesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateCompletionResponseChoicesInner> mapFromJson(dynamic json) {
    final map = <String, CreateCompletionResponseChoicesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateCompletionResponseChoicesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateCompletionResponseChoicesInner-objects as value to a dart map
  static Map<String, List<CreateCompletionResponseChoicesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateCompletionResponseChoicesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateCompletionResponseChoicesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'finish_reason',
    'index',
    'logprobs',
    'text',
  };
}

/// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
class CreateCompletionResponseChoicesInnerFinishReasonEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateCompletionResponseChoicesInnerFinishReasonEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const stop = CreateCompletionResponseChoicesInnerFinishReasonEnum._(r'stop');
  static const length = CreateCompletionResponseChoicesInnerFinishReasonEnum._(r'length');
  static const contentFilter = CreateCompletionResponseChoicesInnerFinishReasonEnum._(r'content_filter');

  /// List of all possible values in this [enum][CreateCompletionResponseChoicesInnerFinishReasonEnum].
  static const values = <CreateCompletionResponseChoicesInnerFinishReasonEnum>[
    stop,
    length,
    contentFilter,
  ];

  static CreateCompletionResponseChoicesInnerFinishReasonEnum? fromJson(dynamic value) => CreateCompletionResponseChoicesInnerFinishReasonEnumTypeTransformer().decode(value);

  static List<CreateCompletionResponseChoicesInnerFinishReasonEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateCompletionResponseChoicesInnerFinishReasonEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateCompletionResponseChoicesInnerFinishReasonEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateCompletionResponseChoicesInnerFinishReasonEnum] to String,
/// and [decode] dynamic data back to [CreateCompletionResponseChoicesInnerFinishReasonEnum].
class CreateCompletionResponseChoicesInnerFinishReasonEnumTypeTransformer {
  factory CreateCompletionResponseChoicesInnerFinishReasonEnumTypeTransformer() => _instance ??= const CreateCompletionResponseChoicesInnerFinishReasonEnumTypeTransformer._();

  const CreateCompletionResponseChoicesInnerFinishReasonEnumTypeTransformer._();

  String encode(CreateCompletionResponseChoicesInnerFinishReasonEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateCompletionResponseChoicesInnerFinishReasonEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateCompletionResponseChoicesInnerFinishReasonEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'stop': return CreateCompletionResponseChoicesInnerFinishReasonEnum.stop;
        case r'length': return CreateCompletionResponseChoicesInnerFinishReasonEnum.length;
        case r'content_filter': return CreateCompletionResponseChoicesInnerFinishReasonEnum.contentFilter;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateCompletionResponseChoicesInnerFinishReasonEnumTypeTransformer] instance.
  static CreateCompletionResponseChoicesInnerFinishReasonEnumTypeTransformer? _instance;
}


