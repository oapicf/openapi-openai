//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TruncationObject {
  /// Returns a new [TruncationObject] instance.
  TruncationObject({
    required this.type,
    this.lastMessages,
  });

  /// The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
  TruncationObjectTypeEnum type;

  /// The number of most recent messages from the thread when constructing the context for the run.
  ///
  /// Minimum value: 1
  int? lastMessages;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TruncationObject &&
    other.type == type &&
    other.lastMessages == lastMessages;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (lastMessages == null ? 0 : lastMessages!.hashCode);

  @override
  String toString() => 'TruncationObject[type=$type, lastMessages=$lastMessages]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    if (this.lastMessages != null) {
      json[r'last_messages'] = this.lastMessages;
    } else {
      json[r'last_messages'] = null;
    }
    return json;
  }

  /// Returns a new [TruncationObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TruncationObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TruncationObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TruncationObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TruncationObject(
        type: TruncationObjectTypeEnum.fromJson(json[r'type'])!,
        lastMessages: mapValueOfType<int>(json, r'last_messages'),
      );
    }
    return null;
  }

  static List<TruncationObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TruncationObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TruncationObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TruncationObject> mapFromJson(dynamic json) {
    final map = <String, TruncationObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TruncationObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TruncationObject-objects as value to a dart map
  static Map<String, List<TruncationObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TruncationObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TruncationObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
  };
}

/// The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
class TruncationObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const TruncationObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const auto = TruncationObjectTypeEnum._(r'auto');
  static const lastMessages = TruncationObjectTypeEnum._(r'last_messages');

  /// List of all possible values in this [enum][TruncationObjectTypeEnum].
  static const values = <TruncationObjectTypeEnum>[
    auto,
    lastMessages,
  ];

  static TruncationObjectTypeEnum? fromJson(dynamic value) => TruncationObjectTypeEnumTypeTransformer().decode(value);

  static List<TruncationObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TruncationObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TruncationObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TruncationObjectTypeEnum] to String,
/// and [decode] dynamic data back to [TruncationObjectTypeEnum].
class TruncationObjectTypeEnumTypeTransformer {
  factory TruncationObjectTypeEnumTypeTransformer() => _instance ??= const TruncationObjectTypeEnumTypeTransformer._();

  const TruncationObjectTypeEnumTypeTransformer._();

  String encode(TruncationObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TruncationObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TruncationObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'auto': return TruncationObjectTypeEnum.auto;
        case r'last_messages': return TruncationObjectTypeEnum.lastMessages;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TruncationObjectTypeEnumTypeTransformer] instance.
  static TruncationObjectTypeEnumTypeTransformer? _instance;
}


