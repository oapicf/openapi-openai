//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageDeltaObject {
  /// Returns a new [MessageDeltaObject] instance.
  MessageDeltaObject({
    required this.id,
    required this.object,
    required this.delta,
  });

  /// The identifier of the message, which can be referenced in API endpoints.
  String id;

  /// The object type, which is always `thread.message.delta`.
  MessageDeltaObjectObjectEnum object;

  MessageDeltaObjectDelta delta;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageDeltaObject &&
    other.id == id &&
    other.object == object &&
    other.delta == delta;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (object.hashCode) +
    (delta.hashCode);

  @override
  String toString() => 'MessageDeltaObject[id=$id, object=$object, delta=$delta]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'object'] = this.object;
      json[r'delta'] = this.delta;
    return json;
  }

  /// Returns a new [MessageDeltaObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageDeltaObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageDeltaObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageDeltaObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageDeltaObject(
        id: mapValueOfType<String>(json, r'id')!,
        object: MessageDeltaObjectObjectEnum.fromJson(json[r'object'])!,
        delta: MessageDeltaObjectDelta.fromJson(json[r'delta'])!,
      );
    }
    return null;
  }

  static List<MessageDeltaObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageDeltaObject> mapFromJson(dynamic json) {
    final map = <String, MessageDeltaObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageDeltaObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageDeltaObject-objects as value to a dart map
  static Map<String, List<MessageDeltaObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageDeltaObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageDeltaObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'object',
    'delta',
  };
}

/// The object type, which is always `thread.message.delta`.
class MessageDeltaObjectObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageDeltaObjectObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodMessagePeriodDelta = MessageDeltaObjectObjectEnum._(r'thread.message.delta');

  /// List of all possible values in this [enum][MessageDeltaObjectObjectEnum].
  static const values = <MessageDeltaObjectObjectEnum>[
    threadPeriodMessagePeriodDelta,
  ];

  static MessageDeltaObjectObjectEnum? fromJson(dynamic value) => MessageDeltaObjectObjectEnumTypeTransformer().decode(value);

  static List<MessageDeltaObjectObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaObjectObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaObjectObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageDeltaObjectObjectEnum] to String,
/// and [decode] dynamic data back to [MessageDeltaObjectObjectEnum].
class MessageDeltaObjectObjectEnumTypeTransformer {
  factory MessageDeltaObjectObjectEnumTypeTransformer() => _instance ??= const MessageDeltaObjectObjectEnumTypeTransformer._();

  const MessageDeltaObjectObjectEnumTypeTransformer._();

  String encode(MessageDeltaObjectObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageDeltaObjectObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageDeltaObjectObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.message.delta': return MessageDeltaObjectObjectEnum.threadPeriodMessagePeriodDelta;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageDeltaObjectObjectEnumTypeTransformer] instance.
  static MessageDeltaObjectObjectEnumTypeTransformer? _instance;
}


