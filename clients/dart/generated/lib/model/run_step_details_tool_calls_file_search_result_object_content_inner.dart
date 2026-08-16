//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDetailsToolCallsFileSearchResultObjectContentInner {
  /// Returns a new [RunStepDetailsToolCallsFileSearchResultObjectContentInner] instance.
  RunStepDetailsToolCallsFileSearchResultObjectContentInner({
    this.type,
    this.text,
  });

  /// The type of the content.
  RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum? type;

  /// The text content of the file.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? text;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDetailsToolCallsFileSearchResultObjectContentInner &&
    other.type == type &&
    other.text == text;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type == null ? 0 : type!.hashCode) +
    (text == null ? 0 : text!.hashCode);

  @override
  String toString() => 'RunStepDetailsToolCallsFileSearchResultObjectContentInner[type=$type, text=$text]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.text != null) {
      json[r'text'] = this.text;
    } else {
      json[r'text'] = null;
    }
    return json;
  }

  /// Returns a new [RunStepDetailsToolCallsFileSearchResultObjectContentInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDetailsToolCallsFileSearchResultObjectContentInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDetailsToolCallsFileSearchResultObjectContentInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDetailsToolCallsFileSearchResultObjectContentInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDetailsToolCallsFileSearchResultObjectContentInner(
        type: RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum.fromJson(json[r'type']),
        text: mapValueOfType<String>(json, r'text'),
      );
    }
    return null;
  }

  static List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsFileSearchResultObjectContentInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsFileSearchResultObjectContentInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDetailsToolCallsFileSearchResultObjectContentInner> mapFromJson(dynamic json) {
    final map = <String, RunStepDetailsToolCallsFileSearchResultObjectContentInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDetailsToolCallsFileSearchResultObjectContentInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDetailsToolCallsFileSearchResultObjectContentInner-objects as value to a dart map
  static Map<String, List<RunStepDetailsToolCallsFileSearchResultObjectContentInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDetailsToolCallsFileSearchResultObjectContentInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDetailsToolCallsFileSearchResultObjectContentInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The type of the content.
class RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum._(r'text');

  /// List of all possible values in this [enum][RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum].
  static const values = <RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum>[
    text,
  ];

  static RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum? fromJson(dynamic value) => RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnumTypeTransformer().decode(value);

  static List<RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum].
class RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnumTypeTransformer {
  factory RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnumTypeTransformer() => _instance ??= const RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnumTypeTransformer._();

  const RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnumTypeTransformer._();

  String encode(RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum.text;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnumTypeTransformer] instance.
  static RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnumTypeTransformer? _instance;
}


