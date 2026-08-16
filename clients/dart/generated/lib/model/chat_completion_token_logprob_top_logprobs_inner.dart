//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionTokenLogprobTopLogprobsInner {
  /// Returns a new [ChatCompletionTokenLogprobTopLogprobsInner] instance.
  ChatCompletionTokenLogprobTopLogprobsInner({
    required this.token,
    required this.logprob,
    this.bytes = const [],
  });

  /// The token.
  String token;

  /// The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
  num logprob;

  /// A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
  List<int>? bytes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionTokenLogprobTopLogprobsInner &&
    other.token == token &&
    other.logprob == logprob &&
    _deepEquality.equals(other.bytes, bytes);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (token.hashCode) +
    (logprob.hashCode) +
    (bytes == null ? 0 : bytes!.hashCode);

  @override
  String toString() => 'ChatCompletionTokenLogprobTopLogprobsInner[token=$token, logprob=$logprob, bytes=$bytes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'token'] = this.token;
      json[r'logprob'] = this.logprob;
    if (this.bytes != null) {
      json[r'bytes'] = this.bytes;
    } else {
      json[r'bytes'] = null;
    }
    return json;
  }

  /// Returns a new [ChatCompletionTokenLogprobTopLogprobsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionTokenLogprobTopLogprobsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatCompletionTokenLogprobTopLogprobsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatCompletionTokenLogprobTopLogprobsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatCompletionTokenLogprobTopLogprobsInner(
        token: mapValueOfType<String>(json, r'token')!,
        logprob: num.parse('${json[r'logprob']}'),
        bytes: json[r'bytes'] is Iterable
            ? (json[r'bytes'] as Iterable).cast<int>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<ChatCompletionTokenLogprobTopLogprobsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionTokenLogprobTopLogprobsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionTokenLogprobTopLogprobsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionTokenLogprobTopLogprobsInner> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionTokenLogprobTopLogprobsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionTokenLogprobTopLogprobsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionTokenLogprobTopLogprobsInner-objects as value to a dart map
  static Map<String, List<ChatCompletionTokenLogprobTopLogprobsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionTokenLogprobTopLogprobsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionTokenLogprobTopLogprobsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'token',
    'logprob',
    'bytes',
  };
}

