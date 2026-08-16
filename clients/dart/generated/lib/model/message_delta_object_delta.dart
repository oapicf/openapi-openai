//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageDeltaObjectDelta {
  /// Returns a new [MessageDeltaObjectDelta] instance.
  MessageDeltaObjectDelta({
    this.role,
    this.content = const [],
  });

  /// The entity that produced the message. One of `user` or `assistant`.
  MessageDeltaObjectDeltaRoleEnum? role;

  /// The content of the message in array of text and/or images.
  List<MessageDeltaObjectDeltaContentInner> content;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageDeltaObjectDelta &&
    other.role == role &&
    _deepEquality.equals(other.content, content);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (role == null ? 0 : role!.hashCode) +
    (content.hashCode);

  @override
  String toString() => 'MessageDeltaObjectDelta[role=$role, content=$content]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.role != null) {
      json[r'role'] = this.role;
    } else {
      json[r'role'] = null;
    }
      json[r'content'] = this.content;
    return json;
  }

  /// Returns a new [MessageDeltaObjectDelta] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageDeltaObjectDelta? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageDeltaObjectDelta[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageDeltaObjectDelta[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageDeltaObjectDelta(
        role: MessageDeltaObjectDeltaRoleEnum.fromJson(json[r'role']),
        content: MessageDeltaObjectDeltaContentInner.listFromJson(json[r'content']),
      );
    }
    return null;
  }

  static List<MessageDeltaObjectDelta> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaObjectDelta>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaObjectDelta.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageDeltaObjectDelta> mapFromJson(dynamic json) {
    final map = <String, MessageDeltaObjectDelta>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageDeltaObjectDelta.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageDeltaObjectDelta-objects as value to a dart map
  static Map<String, List<MessageDeltaObjectDelta>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageDeltaObjectDelta>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageDeltaObjectDelta.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The entity that produced the message. One of `user` or `assistant`.
class MessageDeltaObjectDeltaRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageDeltaObjectDeltaRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const user = MessageDeltaObjectDeltaRoleEnum._(r'user');
  static const assistant = MessageDeltaObjectDeltaRoleEnum._(r'assistant');

  /// List of all possible values in this [enum][MessageDeltaObjectDeltaRoleEnum].
  static const values = <MessageDeltaObjectDeltaRoleEnum>[
    user,
    assistant,
  ];

  static MessageDeltaObjectDeltaRoleEnum? fromJson(dynamic value) => MessageDeltaObjectDeltaRoleEnumTypeTransformer().decode(value);

  static List<MessageDeltaObjectDeltaRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaObjectDeltaRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaObjectDeltaRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageDeltaObjectDeltaRoleEnum] to String,
/// and [decode] dynamic data back to [MessageDeltaObjectDeltaRoleEnum].
class MessageDeltaObjectDeltaRoleEnumTypeTransformer {
  factory MessageDeltaObjectDeltaRoleEnumTypeTransformer() => _instance ??= const MessageDeltaObjectDeltaRoleEnumTypeTransformer._();

  const MessageDeltaObjectDeltaRoleEnumTypeTransformer._();

  String encode(MessageDeltaObjectDeltaRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageDeltaObjectDeltaRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageDeltaObjectDeltaRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'user': return MessageDeltaObjectDeltaRoleEnum.user;
        case r'assistant': return MessageDeltaObjectDeltaRoleEnum.assistant;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageDeltaObjectDeltaRoleEnumTypeTransformer] instance.
  static MessageDeltaObjectDeltaRoleEnumTypeTransformer? _instance;
}


