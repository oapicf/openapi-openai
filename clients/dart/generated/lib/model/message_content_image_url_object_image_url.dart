//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageContentImageUrlObjectImageUrl {
  /// Returns a new [MessageContentImageUrlObjectImageUrl] instance.
  MessageContentImageUrlObjectImageUrl({
    required this.url,
    this.detail = const MessageContentImageUrlObjectImageUrlDetailEnum._('auto'),
  });

  /// The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
  String url;

  /// Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
  MessageContentImageUrlObjectImageUrlDetailEnum detail;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageContentImageUrlObjectImageUrl &&
    other.url == url &&
    other.detail == detail;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (url.hashCode) +
    (detail.hashCode);

  @override
  String toString() => 'MessageContentImageUrlObjectImageUrl[url=$url, detail=$detail]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'url'] = this.url;
      json[r'detail'] = this.detail;
    return json;
  }

  /// Returns a new [MessageContentImageUrlObjectImageUrl] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageContentImageUrlObjectImageUrl? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'url'), 'Required key "MessageContentImageUrlObjectImageUrl[url]" is missing from JSON.');
        assert(json[r'url'] != null, 'Required key "MessageContentImageUrlObjectImageUrl[url]" has a null value in JSON.');
        return true;
      }());

      return MessageContentImageUrlObjectImageUrl(
        url: mapValueOfType<String>(json, r'url')!,
        detail: MessageContentImageUrlObjectImageUrlDetailEnum.fromJson(json[r'detail']) ?? const MessageContentImageUrlObjectImageUrlDetailEnum._('auto'),
      );
    }
    return null;
  }

  static List<MessageContentImageUrlObjectImageUrl> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentImageUrlObjectImageUrl>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentImageUrlObjectImageUrl.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageContentImageUrlObjectImageUrl> mapFromJson(dynamic json) {
    final map = <String, MessageContentImageUrlObjectImageUrl>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageContentImageUrlObjectImageUrl.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageContentImageUrlObjectImageUrl-objects as value to a dart map
  static Map<String, List<MessageContentImageUrlObjectImageUrl>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageContentImageUrlObjectImageUrl>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageContentImageUrlObjectImageUrl.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'url',
  };
}

/// Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
enum MessageContentImageUrlObjectImageUrlDetailEnum {
  auto._(r'auto'),
  low._(r'low'),
  high._(r'high'),
  ;

  /// Instantiate a new enum with the provided value.
  const MessageContentImageUrlObjectImageUrlDetailEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [MessageContentImageUrlObjectImageUrlDetailEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static MessageContentImageUrlObjectImageUrlDetailEnum? fromJson(dynamic value) => MessageContentImageUrlObjectImageUrlDetailEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [MessageContentImageUrlObjectImageUrlDetailEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<MessageContentImageUrlObjectImageUrlDetailEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentImageUrlObjectImageUrlDetailEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentImageUrlObjectImageUrlDetailEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageContentImageUrlObjectImageUrlDetailEnum] to String,
/// and [decode] dynamic data back to [MessageContentImageUrlObjectImageUrlDetailEnum].
class MessageContentImageUrlObjectImageUrlDetailEnumTypeTransformer {
  factory MessageContentImageUrlObjectImageUrlDetailEnumTypeTransformer() => _instance ??= const MessageContentImageUrlObjectImageUrlDetailEnumTypeTransformer._();

  const MessageContentImageUrlObjectImageUrlDetailEnumTypeTransformer._();

  String encode(MessageContentImageUrlObjectImageUrlDetailEnum data) => data._value;

  /// Returns the instance of [MessageContentImageUrlObjectImageUrlDetailEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageContentImageUrlObjectImageUrlDetailEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is MessageContentImageUrlObjectImageUrlDetailEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'auto': return MessageContentImageUrlObjectImageUrlDetailEnum.auto;
        case r'low': return MessageContentImageUrlObjectImageUrlDetailEnum.low;
        case r'high': return MessageContentImageUrlObjectImageUrlDetailEnum.high;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static MessageContentImageUrlObjectImageUrlDetailEnumTypeTransformer? _instance;
}


